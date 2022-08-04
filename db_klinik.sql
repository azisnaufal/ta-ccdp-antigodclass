-- phpMyAdmin SQL Dump
-- version 4.9.7
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Aug 05, 2022 at 03:02 AM
-- Server version: 10.3.35-MariaDB-cll-lve
-- PHP Version: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `calonwib_klinik`
--

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `id_dokter` int(11) NOT NULL,
  `nama_dokter` varchar(100) NOT NULL,
  `alamat_dokter` text NOT NULL,
  `spesialis` varchar(50) NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`id_dokter`, `nama_dokter`, `alamat_dokter`, `spesialis`, `deleted_at`) VALUES
(1, 'Benno', 'Subang', 'Umum', NULL),
(2, 'Farhan', 'Cimahi', 'Psikolog Non Klinis', NULL),
(3, 'Azis Naufal', 'Bandung', 'Ibu dan Anak', '2022-08-04 18:24:11'),
(4, 'Aw', 'Wa', 'Umum', '2022-08-04 18:21:44'),
(5, 'Azis', 'Bandung', 'Umum', '2022-08-04 18:24:42'),
(6, 'Azis', 'GBI', 'Umum', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `id_obat` int(11) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `harga` bigint(20) NOT NULL,
  `tanggal_kadaluarsa` date NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`id_obat`, `nama_obat`, `harga`, `tanggal_kadaluarsa`, `deleted_at`) VALUES
(1, 'BODREX TABLET', 8000, '2023-08-05', NULL),
(2, 'Paramex', 10000, '2022-08-31', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `id_pasien` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `jenis_kelamin` varchar(1) NOT NULL,
  `alamat` text NOT NULL,
  `umur` char(11) NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`id_pasien`, `nama`, `jenis_kelamin`, `alamat`, `umur`, `deleted_at`) VALUES
(1, 'ikan', 'P', 'asas', '99', '2022-08-02 15:56:11'),
(2, 'Benno Alif', 'W', 'Sekeloa, Bandung', '20', '2022-08-04 16:37:24'),
(3, 'Ajsi', 'P', '1', '1', '2022-08-04 01:47:20'),
(4, 'Azis', 'P', 'Bandung', '22', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `pemeriksaan`
--

CREATE TABLE `pemeriksaan` (
  `no_nota` int(11) NOT NULL,
  `id_pasien` int(11) DEFAULT NULL,
  `id_dokter` int(11) DEFAULT NULL,
  `total` bigint(20) NOT NULL,
  `tanggal` date NOT NULL,
  `tinggi_badan` float(6,2) DEFAULT NULL,
  `berat_badan` float(6,2) DEFAULT NULL,
  `sistolik` int(3) DEFAULT NULL,
  `diastolik` int(3) DEFAULT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemeriksaan`
--

INSERT INTO `pemeriksaan` (`no_nota`, `id_pasien`, `id_dokter`, `total`, `tanggal`, `tinggi_badan`, `berat_badan`, `sistolik`, `diastolik`, `deleted_at`) VALUES
(8, 4, 1, 20000, '2022-08-05', 170.00, 60.00, 6, 6, NULL),
(9, 4, 2, 20000, '2022-08-04', 170.00, 60.00, 0, 0, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tercatat`
--

CREATE TABLE `tercatat` (
  `no_nota` int(11) DEFAULT NULL,
  `id_obat` int(6) DEFAULT NULL,
  `subtotal` bigint(20) NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL,
  `qty` int(11) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tercatat`
--

INSERT INTO `tercatat` (`no_nota`, `id_obat`, `subtotal`, `deleted_at`, `qty`) VALUES
(8, 1, 10000, NULL, 1),
(9, 1, 10000, NULL, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tindak`
--

CREATE TABLE `tindak` (
  `no_nota` int(11) DEFAULT NULL,
  `id_tindakan` int(11) DEFAULT NULL,
  `subtotal` bigint(20) NOT NULL DEFAULT 0,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tindak`
--

INSERT INTO `tindak` (`no_nota`, `id_tindakan`, `subtotal`, `deleted_at`) VALUES
(8, 1, 0, NULL),
(9, 1, 0, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `tindakan`
--

CREATE TABLE `tindakan` (
  `id_tindakan` int(11) NOT NULL,
  `nama` varchar(60) NOT NULL,
  `harga` bigint(20) NOT NULL,
  `deleted_at` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tindakan`
--

INSERT INTO `tindakan` (`id_tindakan`, `nama`, `harga`, `deleted_at`) VALUES
(1, 'Suntik', 10000, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`id_dokter`);

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`id_obat`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`id_pasien`);

--
-- Indexes for table `pemeriksaan`
--
ALTER TABLE `pemeriksaan`
  ADD PRIMARY KEY (`no_nota`),
  ADD KEY `id_pasien` (`id_pasien`),
  ADD KEY `id_dokter` (`id_dokter`);

--
-- Indexes for table `tercatat`
--
ALTER TABLE `tercatat`
  ADD KEY `no_nota` (`no_nota`),
  ADD KEY `id_obat` (`id_obat`);

--
-- Indexes for table `tindak`
--
ALTER TABLE `tindak`
  ADD KEY `no_nota` (`no_nota`),
  ADD KEY `id_tindakan` (`id_tindakan`);

--
-- Indexes for table `tindakan`
--
ALTER TABLE `tindakan`
  ADD PRIMARY KEY (`id_tindakan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dokter`
--
ALTER TABLE `dokter`
  MODIFY `id_dokter` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `obat`
--
ALTER TABLE `obat`
  MODIFY `id_obat` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `pasien`
--
ALTER TABLE `pasien`
  MODIFY `id_pasien` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `pemeriksaan`
--
ALTER TABLE `pemeriksaan`
  MODIFY `no_nota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `tindakan`
--
ALTER TABLE `tindakan`
  MODIFY `id_tindakan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pemeriksaan`
--
ALTER TABLE `pemeriksaan`
  ADD CONSTRAINT `pemeriksaan_ibfk_1` FOREIGN KEY (`id_pasien`) REFERENCES `pasien` (`id_pasien`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `pemeriksaan_ibfk_2` FOREIGN KEY (`id_dokter`) REFERENCES `dokter` (`id_dokter`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tercatat`
--
ALTER TABLE `tercatat`
  ADD CONSTRAINT `tercatat_ibfk_1` FOREIGN KEY (`no_nota`) REFERENCES `pemeriksaan` (`no_nota`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tercatat_ibfk_2` FOREIGN KEY (`id_obat`) REFERENCES `obat` (`id_obat`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tindak`
--
ALTER TABLE `tindak`
  ADD CONSTRAINT `tindak_ibfk_1` FOREIGN KEY (`no_nota`) REFERENCES `pemeriksaan` (`no_nota`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tindak_ibfk_2` FOREIGN KEY (`id_tindakan`) REFERENCES `tindakan` (`id_tindakan`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
