-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Dec 12, 2016 at 01:01 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 5.5.37

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `polikliniktelkom_rev`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `kodeAdmin` varchar(25) NOT NULL,
  `namaAdmin` varchar(100) NOT NULL,
  `password` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`kodeAdmin`, `namaAdmin`, `password`) VALUES
('ADMIN-1', 'Dindin Dhino Alamsyah', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `kodeDokter` varchar(25) NOT NULL,
  `namaDokter` varchar(100) NOT NULL,
  `password` varchar(64) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`kodeDokter`, `namaDokter`, `password`, `alamat`) VALUES
('DOKTER1', 'Anggie Nastiti', 'anggie', 'Jayapura'),
('DOKTER2', 'Dhino A', 'dhino', 'Bandung');

-- --------------------------------------------------------

--
-- Table structure for table `jadwal`
--

CREATE TABLE `jadwal` (
  `kodeJadwal` varchar(25) NOT NULL,
  `shift` varchar(15) NOT NULL,
  `tanggal` date NOT NULL,
  `kodeDokter` varchar(25) NOT NULL,
  `kodePasien` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jadwal`
--

INSERT INTO `jadwal` (`kodeJadwal`, `shift`, `tanggal`, `kodeDokter`, `kodePasien`) VALUES
('JADWAL1', '09.00-12.00', '2016-12-14', 'DOKTER1', 'P1301144270'),
('JADWAL2', '13.00-15.00', '2016-12-14', 'DOKTER1', 'P1301144270'),
('JADWAL3', '16.00-18.00', '2016-12-14', 'DOKTER1', NULL),
('JADWAL4', '09.00-12.00', '2016-12-15', 'DOKTER2', NULL),
('JADWAL5', '13.00-15.00', '2016-12-15', 'DOKTER2', NULL),
('JADWAL6', '16.00-18.00', '2016-12-15', 'DOKTER2', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `obat`
--

CREATE TABLE `obat` (
  `idObat` varchar(25) NOT NULL,
  `namaObat` varchar(100) NOT NULL,
  `jenis` varchar(64) NOT NULL,
  `harga` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `obat`
--

INSERT INTO `obat` (`idObat`, `namaObat`, `jenis`, `harga`) VALUES
('OBAT1', 'Ohbeha', 'puyer', 1000),
('OBAT2', 'Wohoodz', 'cair', 5000);

-- --------------------------------------------------------

--
-- Table structure for table `pasien`
--

CREATE TABLE `pasien` (
  `kodePasien` varchar(25) NOT NULL,
  `namaPasien` varchar(100) NOT NULL,
  `password` varchar(64) NOT NULL,
  `umur` int(11) NOT NULL,
  `keluhan` text,
  `diagnosa` text,
  `idObat` varchar(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pasien`
--

INSERT INTO `pasien` (`kodePasien`, `namaPasien`, `password`, `umur`, `keluhan`, `diagnosa`, `idObat`) VALUES
('P1301140310', 'Nur Indah Puspa Idham', 'indah', 22, NULL, NULL, NULL),
('P1301144270', 'Faza Ghassani', 'ganis', 20, 'sakit perut, mual-mual, panas, pusing, letih, lesu', 'HAMIL KU JURIG :(', 'OBAT2');

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
  ADD UNIQUE KEY `kodeJadwal` (`kodeJadwal`),
  ADD KEY `kodeDokter` (`kodeDokter`),
  ADD KEY `kodePasien` (`kodePasien`);

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
  ADD UNIQUE KEY `kodePasien` (`kodePasien`),
  ADD KEY `idObat` (`idObat`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `jadwal`
--
ALTER TABLE `jadwal`
  ADD CONSTRAINT `jadwal_ibfk_1` FOREIGN KEY (`kodeDokter`) REFERENCES `dokter` (`kodeDokter`),
  ADD CONSTRAINT `jadwal_ibfk_2` FOREIGN KEY (`kodePasien`) REFERENCES `pasien` (`kodePasien`);

--
-- Constraints for table `pasien`
--
ALTER TABLE `pasien`
  ADD CONSTRAINT `pasien_ibfk_1` FOREIGN KEY (`idObat`) REFERENCES `obat` (`idObat`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
