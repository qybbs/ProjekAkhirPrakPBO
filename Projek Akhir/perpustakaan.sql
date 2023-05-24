-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 20, 2023 at 02:44 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `ID` int(11) NOT NULL,
  `ISBN` varchar(50) NOT NULL,
  `Judul` varchar(50) NOT NULL,
  `Pengarang` varchar(50) NOT NULL,
  `Tahun_terbit` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`ID`, `ISBN`, `Judul`, `Pengarang`, `Tahun_terbit`) VALUES
(1, '1040001', 'Katakan kepadaku kapan? Ilmu pengetahuan umum', 'Drs. Alexander Sindoro', '2006'),
(2, '104000', 'Katakan kepadaku mengenai? Pengetahuan umum', 'Drs.Alexander Sindoro', '2006'),
(3, '1040001', 'Kunci belajar anak pintar untuk SD', 'Redaksi Tera', '2006'),
(4, '1040001', 'Menulis laporan dan proposal', 'Alexander Hamilton Institute', '2006'),
(5, '1040001', 'Membuat berbagai DVD-Video dengan ulead video stud', 'Ian Chandra K.', '2006'),
(6, '110001', 'Pergulatan intelektual dalam era kegelisahan', 'Frans Magnis - Suseno, dkk', '2006'),
(7, '110002', 'Keimanan guru pengusaha', 'H. Probosutedjo', '2006'),
(8, '110003', 'the balance ways', 'M.K. Sutrisna Suryadilaga', '2006'),
(9, '140001', 'Metodologi penelitian ilmu sosial ekonomi', 'I Gusti Ngurah Gorda', '2006'),
(10, '140002', 'Metode pengumpulan data', 'Josep R. Tarigan & M. Suparmoko', '2006'),
(11, '140003', 'Metodologi penelitian', 'Sumadi Suryabrata', '2006'),
(12, '140004', 'Metodologi penelitian kualitatif', 'Burhan Bungin', '2006'),
(13, '140005', 'Metodologi Penelitian Kualitatif', 'Lexy J. Moleong', '2006'),
(14, '140006', 'Metode penelitian kuantitatif', 'Bambang Prasetyo & Lina Miftahul Jannah', '2006'),
(15, '140007', 'Desain penelitian MSDM dan perilaku karyawan : par', 'Husein Umar', '2006'),
(16, '140008', 'Metode penelitian', 'Moh. Nazir', '2006'),
(17, '140009', 'Metode penelitian : suatu pemikiran dan penerapan', 'Soejono & Abdurrahman', '2006'),
(18, '140010', 'Metode penelitian sosial: suatu teknik penelitianb', 'Irawan Soehartono', '2006'),
(19, '140011', 'Menyusun rencana penelitian', 'Tatang M. Amirin', '2006'),
(20, '140012', 'Metode penelitian sosial', 'Bagong Suyanto, dkk', '2006'),
(21, '140013', 'Metode penelitian ilmu sosial ekonomi', 'I Gusti Ngurah Gorda', '2006'),
(22, '140014', 'metodologi research 2 untuk penulisan paper, skrip', 'Sutrisno Hadi', '2006'),
(23, '140015', 'Kamus Istilah Karya Tulis Ilmiah', 'Prof. Komaruddin, Dra. Yooke Tjuparmah S. Kom', '2006'),
(24, '140016', 'Metodologi penelitian : memberikan bekal teoretis ', 'Drs. Cholid Narbuko dan Drs. H. Abu Achmadi', '2006'),
(25, '140017', 'Menulis Karya Ilmiah : Panduan Lengkap Menulis Mak', 'Rameli Agam', '2006'),
(26, '1420001', 'Metode penelitian survai', 'Anonim', '2006'),
(27, '1420002', 'Metodologi penelitian kualitatif', 'Deddy Mulyana', '2006'),
(28, '1420003', 'Metodologi penelitian kualitatif: paradigma baru i', 'Deddy Mulyana', '2006'),
(29, '1420004', 'metodologi penelitian sistem informasi', 'Jogiyanto HM.', '2006'),
(30, '1420005', 'Pengantar Metodologi Penelitian Budaya Rupa : Desa', 'S Agus Sachari', '2006'),
(31, '150001', 'Komunikasi pembelajaran: peran dan keterampilan gu', 'Karti Soeharto', '2006'),
(32, '150002', 'Membangun komunikasi dan informasi gotong royong', 'A. Saefudin', '2006'),
(33, '160001', 'Panduan praktis membuat web dengan PHP untuk pemul', 'FN. Jovan', '2006'),
(34, '1640001', 'Buku latihan render dan animasi dengan 3D studio V', 'Djoko Darmawan', '2006'),
(35, '200001', 'Buku membangun kualitas bangsa.', 'Tim Penyusun', '2006'),
(36, '300001', 'Cara belajar komputer secara praktis', 'Dedy Rusmadi', '2006'),
(37, '310001', 'Trik menyelamatkan data pada Windows 95', 'Tri Amperiyanto', '2006'),
(38, '320001', 'Menjemput masa depan', 'Dimitri Mahayana', '2017'),
(39, '350001', 'Statistika dan sistem informasi untuk pimpinan', 'J. Supranto', '2017'),
(40, '350002', 'Teori Komunikasi Massa', 'John Vivian', '2017'),
(41, '35030001', 'kamus hacker', 'Dony Ariyus', '2017'),
(42, '400001', 'Pengetahuan tentang komputer', 'Andy Santoso', '2017'),
(43, '400002', 'Komputer si mesin pintar', 'Eko Sujatmiko', '2017'),
(44, '400003', 'Mudah menggunakan komputer', 'Ida Rahmawati', '2017'),
(45, '400004', 'Belajar merakit komputer', 'Atang Gumawang', '2017'),
(46, '400005', 'Singkat tepat jelas Microsoft Windows ME ( milleni', 'M.Agus J.Alam', '2017'),
(47, '400006', 'Windows me millenium edition', 'M. Agus J.  Alam', '2017'),
(48, '400007', 'Menyiasati 6 masalah komputer: seri penuntun prakt', 'Tri Amperiyanto', '2017'),
(49, '400008', 'Mengenal Hardware - Software dan pengelolaan Insta', 'Melwin Syafrizal Daulay', '2017'),
(50, '400009', 'Buku Latihan pemrograman Visual Basic 6 untuk SMA', 'Hengky Alexander Mangkulo', '2017'),
(51, '400010', 'Aplikasi Web Mobile Menggunakan ASP.NET', 'Didik Dwi Prasetyo', '2017'),
(52, '400011', 'Bank Soal Delphi', 'Hengky Alexander Mangkulo', '2017'),
(53, '4030001', 'Kamus teknologi informasi', 'Woro Vidya Ayuningtyas', '2017'),
(54, '4030002', 'Kamus jaringan komputer : dilengkapi dengan daftar', 'Dian Widodo', '2017'),
(55, '4070001', 'Sahabat dunia maya', 'Indah Widiastuti', '2017'),
(56, '4070002', 'Perkenalan dengan TIK', 'Eko Sujatmiko', '2017'),
(57, '4070003', 'Berkenalan dengan windows', 'M.S. Maggie Key', '2017'),
(58, '4070004', 'Berkenalan dengan komputer', 'Joko Widiyatmoko', '2025'),
(59, '4070005', 'Berkenalan dengan pengolah kata', 'M.S. Maggie Key', '2025'),
(60, '4070006', 'Berkenalan dengan lembar kerja', 'M.S. Maggie Key', '2025'),
(61, '4070007', 'Berkenalan dengan pengolah data', 'Joko Widiyatmoko', '2025'),
(62, '4070008', 'Belajar pemrograman komputer untuk pelajar', 'Adi Nugroho', '2025'),
(63, '4070009', 'Berkenalan dengan TIK', 'Eko Sujatmiko', '2025'),
(64, '410001', 'Tiga D modeling dengan autoCAD 2006', 'Andi Khrisbianto', '2025'),
(65, '410002', 'Belajar kreasi langsung praktek tehnik mengefek de', 'Eppy Yunardi', '2025'),
(66, '410003', 'Microsoft Windows XP: mahir dalam 7 hari', '', '2025'),
(67, '410004', 'Mahir dalam 7 hari microsoft windows xp', '', '2025'),
(68, '41650001', 'Mikroprosesor intel : arsitektur, pemrograman anta', '', '2025'),
(69, '420001', 'Berkenalan dengan program desain grafis sukses men', 'Getut Pramesti', '2025'),
(70, '430001', 'Cara mudah belajar yahoo! ', 'Juni Muliawan Faizal', '2025'),
(71, '460001', 'Pengantar teknologi informasi internet, konsep dan', 'Budi Sutedjo Dharma Oetomo,  Esther Wibowo', '2025'),
(72, '460002', 'peta jalan internet ', 'Bennett Falk', '2025'),
(73, '460003', 'Akses internet GPRS: melalui laptop dengan ponsel ', 'Emansa H.P.', '2025'),
(74, '4670001', 'Koneksi internet menggunakan perangkat GSM + CDMA', '', '2025'),
(75, '4670003', 'Buku Pintar Linux : Membangun Jaringan Diskless Be', 'Dr. Richardus Eko Indrajit.', '2025'),
(76, '4670004', 'Ngenet : Panduan Berinternet untuk Pemula M. Syams', 'Arista Prasetyo Adi & Ridwan Sanjaya', '2025'),
(77, '4670005', 'easy money from internet: meraup uang dengan adbri', 'Tutang, Ahmad Saefudin S, dan Tutuko S.', '2025'),
(78, '46780001', 'game terbaik facebook ', 'Cipta Halim & Adhicipta R. Wirawan', '2025'),
(79, '46780002', 'serunya chatting di Yahoo! Messenger: ABG series', ' Eko H. Setianto & SmitDev Community', '2025'),
(80, '46780003', 'Plurk for cari duit Jubilee Enterprise', '', '2025'),
(81, '46780004', 'Hosting & sharing foto video dengan ACDSee 10 Domi', 'Solusindo', '2025'),
(82, '46780005', 'Buku Pintar Internet : Membangun Web Dinamis di Li', 'Didik Dwi Prasetyo', '2025'),
(83, '46780006', 'Special Project : 26 Kreasi Web Buttons Photoshop ', 'Gregorius Agung', '2009'),
(84, '46780007', 'Seri Freeware Populer Zoner Draw 3 for Windows', ' Felix Lukman, SE. Skom.', '2009'),
(85, '46780016', '\"Monetizing\" Your Blogger Now!', 'Adam pahlevi Baihaqi', '2009'),
(86, '46780017', '101 Tip & Trik Google', 'Jubilee Enterprise', '2009'),
(87, '4678070001', 'supermedia: panduan praktis memanfaatkan media men', 'Erlangga', '2009'),
(88, '4678070002', 'Hacker\'s Biggest Secret Friendster Hacking', 'ThOR', '2009'),
(89, '4840001', 'Ayo tune up komputer anda', 'Penerbit Andi', '2009'),
(90, '500001', '36 jam belajar komputer: video & audio editing den', 'PT Elek Media Komputindo', '2009'),
(91, '500002', 'Belajar komputer untuk anak', 'Ajen Dianawati', '2009'),
(92, '500003', '3ds max 6 untuk orang awam', 'Handi Chandra', '2009'),
(93, '510001', 'Aplikasi sistem pakar', 'Kusrini', '2009'),
(94, '510002', 'pemrograman mikrokontroler R8C/13', 'Nanang Sulistiyanto', '2009'),
(95, '510003', 'panduan praktis silverlight dan expression blend', 'Fuady Rosma Hidayat', '2009'),
(96, '510004', 'Aplikasi Inventory dengan Powerbuilder 8.0', 'Syahrial Chan', '2009'),
(97, '510005', 'Aplikasi Database Server Interbase', 'Albertus Dwiyoga W.', '2009'),
(98, '510006', 'Seri Freeware Populer Pemrograman Phyton', 'Felix Lukman, SE. Skom.', '2003'),
(99, '510007', 'Pemrograman Telephony dengan Delphi', 'Ridwan M. Dettan', '2004'),
(100, '510008', 'Keamanan Microsoft Windows NT : Panduan Bagi Admin', 'Nevin Lambert & Manish Patel', '2005'),
(101, '510009', 'Special Project : 22 Kreasi Desain Grafis dengan F', 'Gregorius Agung', '2004'),
(102, '510010', 'Seri Pembelajaran Komputer : Mengoperasikan Softwa', 'Tim Digital Studio', '2007'),
(103, '510011', 'Java 2 Micro Edition Tingkat Lanjut', 'Antonius Aditya Hartanto', '2008'),
(104, '510012', 'Seri Pelajaran Komputer Macromedia MX', 'Arief Ramadhan', '2009');

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `ID` int(11) NOT NULL,
  `IDUser` int(11) NOT NULL,
  `IDBuku` int(11) NOT NULL,
  `TglPinjam` date NOT NULL,
  `TglHarusKembali` date NOT NULL,
  `TglKembali` date DEFAULT NULL,
  `Denda` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `ID` int(11) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `UserType` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `Username`, `Password`, `UserType`) VALUES
(123210015, 'endricowisnu', 'endricowisnu', 'user'),
(123210025, 'yogapasaribu', 'yogapasaribu', 'user'),
(123210034, 'brammavizar', 'brammavizar', 'user'),
(123210047, 'danielhasiando', 'danielhasiando', 'user'),
(123210049, 'amadiasekar', 'prakpbo', 'user'),
(123210107, 'iqbalghozy', 'prakpbo', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `IDUser` (`IDUser`),
  ADD KEY `IDBuku` (`IDBuku`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `buku`
--
ALTER TABLE `buku`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=105;

--
-- AUTO_INCREMENT for table `peminjaman`
--
ALTER TABLE `peminjaman`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=123210108;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `peminjaman`
--
ALTER TABLE `peminjaman`
  ADD CONSTRAINT `peminjaman_pjmfk_1` FOREIGN KEY (`IDUser`) REFERENCES `user` (`ID`),
  ADD CONSTRAINT `peminjaman_pjmfk_2` FOREIGN KEY (`IDBuku`) REFERENCES `buku` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
