-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2016 at 06:33 PM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.5.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `polikliniktelkom`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `namaAdmin` varchar(100) NOT NULL,
  `kodeAdmin` varchar(15) NOT NULL,
  `password` varchar(32) NOT NULL,
  `Pasien` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`namaAdmin`, `kodeAdmin`, `password`, `Pasien`) VALUES
('Dindin Dhino Alamsyah', 'Admin1', 'teuing', 'Model.Pasien@5d3fd37d');

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `namaDokter` varchar(100) NOT NULL,
  `kodeDokter` varchar(15) NOT NULL,
  `password` varchar(32) NOT NULL,
  `alamat` text NOT NULL,
  `Pasien` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`namaDokter`, `kodeDokter`, `password`, `alamat`, `Pasien`) VALUES
('AN', 'DOKTER1', 'bakekok', 'jayapura', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `kodeJadwal` varchar(15) NOT NULL,
  `shift` varchar(15) NOT NULL,
  `hari` varchar(7) NOT NULL,
  `tanggal` date NOT NULL,
  `Dokter` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`kodeJadwal`, `shift`, `hari`, `tanggal`, `Dokter`) VALUES
('JADWAL1', '09.00-12.00', 'Selasa', '2016-11-22', NULL),
('JADWAL2', '09.00-12.00', 'Selasa', '2016-11-29', NULL),
('JADWAL3', '13.00-15.00', 'Selasa', '2016-12-29', NULL),
('JADWAL4', '13.00-15.00', 'Selasa', '2016-12-29', '[Model.Dokter@640c657f]'),
('JADWAL5', '09.00-12.00', 'KAMIS', '2016-12-01', '[Model.Dokter@1ff08e62]');

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `idObat` varchar(15) NOT NULL,
  `namaObat` varchar(100) NOT NULL,
  `jenis` varchar(20) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`idObat`, `namaObat`, `jenis`, `harga`) VALUES
('OBAT1', 'Obeha', 'puyer', 5000);

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `namaPasien` varchar(100) NOT NULL,
  `kodePasien` varchar(15) NOT NULL,
  `password` varchar(32) NOT NULL,
  `umur` int(11) NOT NULL,
  `keluhan` text,
  `diagnosa` text,
  `Obat` text,
  `Jadwal` text
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`namaPasien`, `kodePasien`, `password`, `umur`, `keluhan`, `diagnosa`, `Obat`, `Jadwal`) VALUES
('bakeok', 'P123', '321', 321, 'sakit eu', NULL, NULL, NULL),
('indah', 'P1301140310', 'asda', 23, NULL, NULL, NULL, NULL),
('Anggie Nastiti', 'P1301142100', 'anggie', 20, 'sakit perut pengen berak cuyy', NULL, NULL, NULL),
('ganis', 'P1301144270', 'a', 72, NULL, NULL, NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`kodeAdmin`),
  ADD UNIQUE KEY `kodeAdmin` (`kodeAdmin`);

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`kodeDokter`),
  ADD UNIQUE KEY `kodeDokter` (`kodeDokter`);

--
-- Indexes for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD PRIMARY KEY (`kodeJadwal`),
  ADD UNIQUE KEY `kodeJadwal` (`kodeJadwal`);

--
-- Indexes for table `obat`
--
ALTER TABLE `obat`
  ADD PRIMARY KEY (`idObat`),
  ADD UNIQUE KEY `idObat` (`idObat`);

--
-- Indexes for table `pasien`
--
ALTER TABLE `pasien`
  ADD PRIMARY KEY (`kodePasien`),
  ADD UNIQUE KEY `kodePasien` (`kodePasien`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
