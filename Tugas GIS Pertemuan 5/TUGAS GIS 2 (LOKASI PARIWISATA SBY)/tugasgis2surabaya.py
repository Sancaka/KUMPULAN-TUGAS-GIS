import mapnik
m = mapnik.Map(600,300)
m.background = mapnik.Color('steelblue')
s = mapnik.Style()
r = mapnik.Rule() 
polygon_symbolizer = mapnik.PolygonSymbolizer()
polygon_symbolizer.fill = mapnik.Color('#008000')
r.symbols.append(polygon_symbolizer)

line_symbolizer = mapnik.LineSymbolizer()
line_symbolizer = mapnik.LineSymbolizer(mapnik.Color('white'),1)
line_symbolizer.stroke_width = 10.0


# pemberian gambar
point_sym = mapnik.MarkersSymbolizer()
point_sym.filename = 'images/plane.png'
point_sym.width = mapnik.Expression("20")
point_sym.height = mapnik.Expression("20")
point_sym.allow_overlap = True
r.symbols.append(point_sym)

text_sym = mapnik.TextSymbolizer(mapnik.Expression('[PROVNO]'),'DejaVu Sans Bold',5,mapnik.Color('black'))
text_sym.halo_radius = 1
text_sym.allow_overlap = True
text_sym.avoid_edges = False
r.symbols.append(text_sym)

s.rules.append(r)
m.append_style('airport point',s)
ds = mapnik.MemoryDatasource()
f = mapnik.Feature(mapnik.Context(),1)
f['PROVNO'] = 'asd asbdashbd ahsbdasbd'
f.add_geometries_from_wkt("POINT(1000 1000)")
ds.add_feature(f)

player = mapnik.Layer('airport_layer')
player.datasource = ds
player.styles.append('airport point')
m.layers.append(player)
#  batas akhir gambar 

r.symbols.append(line_symbolizer)
s.rules.append(r)
m.append_style('Sancaka',s)
ds = mapnik.Shapefile(file="KOTA SURABAYA/SURABAYA.shp")
layer = mapnik.Layer('world')
layer.datasource = ds
layer.styles.append('Sancaka')
m.layers.append(layer)
m.zoom_all()
mapnik.render_to_file(m,'surabaya.jpeg','jpeg')
print "rendered image to 'surabaya.jpeg'"