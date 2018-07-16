PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE smk(
ID_SEKOLAH INT PRIMARY KEY NOT NULL,
NAMA_SEKOLAH TEXT NOT NULL,
LONGTITUDE TEXT NOT NULL,
LATITUDE TEXT NOT NULL
);
CREATE TABLE jurusan(
ID_JURUSAN INT PRIMARY KEY NOT NULL,
NAMA_JURUSAN TEXT NOT NULL
);
INSERT INTO jurusan VALUES(1,'Akomodasi Perkantoran');
INSERT INTO jurusan VALUES(2,'Akomodasi Perhotelan');
INSERT INTO jurusan VALUES(3,'Akuntansi');
INSERT INTO jurusan VALUES(4,'Akomodasi dan Keuangan Lembaga');
INSERT INTO jurusan VALUES(5,'Analisa Kesehatan');
INSERT INTO jurusan VALUES(6,'Animasi');
INSERT INTO jurusan VALUES(7,'Bisnis Daring dan Pemasaran');
INSERT INTO jurusan VALUES(8,'Broadcasting');
INSERT INTO jurusan VALUES(9,'Desain Grafis');
INSERT INTO jurusan VALUES(10,'Desain Interior dan Landscapping');
INSERT INTO jurusan VALUES(11,'Desain Komunikasi Visual');
INSERT INTO jurusan VALUES(12,'Desain Pemodelan dan Informasi Bangungan');
INSERT INTO jurusan VALUES(13,'Desain Web');
INSERT INTO jurusan VALUES(14,'Farmasi');
INSERT INTO jurusan VALUES(15,'Fotografi');
INSERT INTO jurusan VALUES(16,'Jasa Butik');
INSERT INTO jurusan VALUES(17,'Keperawatan');
INSERT INTO jurusan VALUES(18,'Kimia Industri');
INSERT INTO jurusan VALUES(19,'Konstruksi Gedung , Sanitasi dan Perawatan');
INSERT INTO jurusan VALUES(20,'Kria Kayu');
INSERT INTO jurusan VALUES(21,'Kria Kulit');
INSERT INTO jurusan VALUES(22,'Multimedia');
INSERT INTO jurusan VALUES(23,'Neutika Kapal Niaga');
INSERT INTO jurusan VALUES(24,'Otomatisasi dan Tata Kelola Perkantoran');
INSERT INTO jurusan VALUES(25,'Pemasaran');
INSERT INTO jurusan VALUES(26,'Pengawasan Mutu Pangan');
INSERT INTO jurusan VALUES(27,'Perawatan Kesehatan');
INSERT INTO jurusan VALUES(28,'Perbankan');
INSERT INTO jurusan VALUES(29,'Perdagangan');
INSERT INTO jurusan VALUES(30,'Rekayasa Perangkat Lunak / Software Programming');
INSERT INTO jurusan VALUES(31,'Sistem Informatika, Jaringan dan Aplikasi');
INSERT INTO jurusan VALUES(32,'Tata Boga Restoran');
INSERT INTO jurusan VALUES(33,'Tata Boga');
INSERT INTO jurusan VALUES(34,'Tata Busana');
INSERT INTO jurusan VALUES(35,'Tata Kecantikan Kulit');
INSERT INTO jurusan VALUES(36,'Tata Kecantikan Rambut');
INSERT INTO jurusan VALUES(37,'Tata Laksana Kapal Niaga');
INSERT INTO jurusan VALUES(38,'Teknik Audio Video / Elektronika');
INSERT INTO jurusan VALUES(39,'Teknik dan Bisnis Sepeda Motor');
INSERT INTO jurusan VALUES(40,'Teknik dan Manajemen Perawatan Otomotif');
INSERT INTO jurusan VALUES(41,'Teknik Elektronika Daya dan Komunikasi');
INSERT INTO jurusan VALUES(42,'Teknik Elektronika Industri');
INSERT INTO jurusan VALUES(43,'Teknik Fabrikasi Logam dan Manufakturing');
INSERT INTO jurusan VALUES(44,'Teknik Gambar Bangunan dan Konstruksi Batu Beton');
INSERT INTO jurusan VALUES(45,'Teknik Gambar Bangunan');
INSERT INTO jurusan VALUES(46,'Teknik Instalasi Pemesinan Kapal');
INSERT INTO jurusan VALUES(47,'Teknik Instalasi Tenaga Listrik');
INSERT INTO jurusan VALUES(48,'Teknik Kendaraan Ringan Otomotif');
INSERT INTO jurusan VALUES(49,'Teknik Komputer dan Jaringan');
INSERT INTO jurusan VALUES(50,'Teknik Konstruksi Batu Beton');
INSERT INTO jurusan VALUES(51,'Teknik Konstruksi dan Properti');
INSERT INTO jurusan VALUES(52,'Teknik Konstruksi Kapal Baja');
INSERT INTO jurusan VALUES(53,'Teknik Mesin Kapal Niaga');
INSERT INTO jurusan VALUES(54,'Teknik Otomasi Industri');
INSERT INTO jurusan VALUES(55,'Teknik Otomotif');
INSERT INTO jurusan VALUES(56,'Teknik Pemesinan');
INSERT INTO jurusan VALUES(57,'Teknik Pendingin dan Tata Udara');
INSERT INTO jurusan VALUES(58,'Teknik Pengelasan');
INSERT INTO jurusan VALUES(59,'Teknik Produksi dan Penyiaran Radio dan Pertevilisian');
INSERT INTO jurusan VALUES(60,'Teknik Sepeda Motor');
INSERT INTO jurusan VALUES(61,'Teknik Tenaga Listrik');
INSERT INTO jurusan VALUES(62,'Teknika Kapal Niaga');
INSERT INTO jurusan VALUES(63,'Usaha Jasa Pariwisata');
INSERT INTO jurusan VALUES(64,'Videografi');
CREATE TABLE smk_jurusan(
ID_SMK INT PRIMARY KEY NOT NULL,
ID_SEKOLAH INT NOT NULL,
ID_JURUSAN INT NOT NULL,
FOREIGN KEY (ID_SEKOLAH) REFERENCES smk(ID_SEKOLAH),
FOREIGN KEY (ID_JURUSAN) REFERENCES jurusan(ID_JURUSAN)
);
COMMIT;
