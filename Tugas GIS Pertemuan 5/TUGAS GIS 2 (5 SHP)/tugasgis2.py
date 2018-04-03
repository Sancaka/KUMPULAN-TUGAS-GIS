import mapnik
m = mapnik.Map(3840,2160)
m.background = mapnik.Color('steelblue')
# MAP 1 DUNIA
s = mapnik.Style()
r = mapnik.Rule()
polygon_symbolizer = mapnik.PolygonSymbolizer()
polygon_symbolizer.fill = mapnik.Color('#7FFF00')
r.symbols.append(polygon_symbolizer)

line_symbolizer = mapnik.LineSymbolizer()
line_symbolizer = mapnik.LineSymbolizer(mapnik.Color('white'),1)
line_symbolizer.stroke_width = 10.0

r.symbols.append(line_symbolizer)
s.rules.append(r)
m.append_style('Sancaka',s)
ds = mapnik.Shapefile(file="countries/ne_110m_admin_0_countries.shp")
layer = mapnik.Layer('world')
layer.datasource = ds
layer.styles.append('Sancaka')
m.layers.append(layer)
# BATAS AKHIR MAP 1 DUNIA

# MAP 2 PROVINSI INDONESIA 
s = mapnik.Style()
r = mapnik.Rule()
polygon_symbolizer = mapnik.PolygonSymbolizer()
polygon_symbolizer.fill = mapnik.Color('#D2691E')
r.symbols.append(polygon_symbolizer)

line_symbolizer = mapnik.LineSymbolizer()
line_symbolizer = mapnik.LineSymbolizer(mapnik.Color('white'),1)
line_symbolizer.stroke_width = 10.0

r.symbols.append(line_symbolizer)
s.rules.append(r)
m.append_style('Sancaka2',s)
ds = mapnik.Shapefile(file="provinsiindonesia/INDONESIA_PROP.shp")
layer = mapnik.Layer('provinsi')
layer.datasource = ds
layer.styles.append('Sancaka2')
m.layers.append(layer)
# BATAS AKHIR MAP 2 PROVINSI INDONESIA

# MAP 3 CINA
s = mapnik.Style()
r = mapnik.Rule()
polygon_symbolizer = mapnik.PolygonSymbolizer()
polygon_symbolizer.fill = mapnik.Color('#00FFFF')
r.symbols.append(polygon_symbolizer)

line_symbolizer = mapnik.LineSymbolizer()
line_symbolizer = mapnik.LineSymbolizer(mapnik.Color('white'),1)
line_symbolizer.stroke_width = 10.0

r.symbols.append(line_symbolizer)
s.rules.append(r)
m.append_style('Sancaka3',s)
ds = mapnik.Shapefile(file="mapcina/map.shp")
layer = mapnik.Layer('provinsicina')
layer.datasource = ds
layer.styles.append('Sancaka3')
m.layers.append(layer)
# BATAS MAP 3 CINA

# MAP 4 EKUADOR
s = mapnik.Style()
r = mapnik.Rule()
polygon_symbolizer = mapnik.PolygonSymbolizer()
polygon_symbolizer.fill = mapnik.Color('#FF0000')
r.symbols.append(polygon_symbolizer)

line_symbolizer = mapnik.LineSymbolizer()
line_symbolizer = mapnik.LineSymbolizer(mapnik.Color('white'),1)
line_symbolizer.stroke_width = 10.0

r.symbols.append(line_symbolizer)
s.rules.append(r)
m.append_style('Sancaka4',s)
ds = mapnik.Shapefile(file="mapecuador/map.shp")
layer = mapnik.Layer('provinsiecuador')
layer.datasource = ds
layer.styles.append('Sancaka4')
m.layers.append(layer)
# BATAS MAP 4 EKUADOR

# MAP 5 Australia
s = mapnik.Style()
r = mapnik.Rule()
polygon_symbolizer = mapnik.PolygonSymbolizer()
polygon_symbolizer.fill = mapnik.Color('#FF00FF')
r.symbols.append(polygon_symbolizer)

line_symbolizer = mapnik.LineSymbolizer()
line_symbolizer = mapnik.LineSymbolizer(mapnik.Color('white'),1)
line_symbolizer.stroke_width = 10.0

r.symbols.append(line_symbolizer)
s.rules.append(r)
m.append_style('Sancaka5',s)
ds = mapnik.Shapefile(file="mapaustralia/map.shp")
layer = mapnik.Layer('provinsiaustralia')
layer.datasource = ds
layer.styles.append('Sancaka5')
m.layers.append(layer)
# BATAS MAP 5 Australia

m.zoom_all()
mapnik.render_to_file(m,'world.jpeg','jpeg')
print "rendered image to 'world.jpeg'"