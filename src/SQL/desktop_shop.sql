-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3307
-- Generation Time: Jul 03, 2022 at 02:09 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `desktop_shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` int(10) NOT NULL,
  `username` varchar(80) NOT NULL,
  `password` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `username`, `password`) VALUES
(1302204085, 'Admin', 'admin1');

-- --------------------------------------------------------

--
-- Table structure for table `desktop`
--

CREATE TABLE `desktop` (
  `computer_id` varchar(10) NOT NULL,
  `processor_speed` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ram` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `hard_disk` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `monitor` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `quantity` int(50) NOT NULL,
  `price` int(80) NOT NULL,
  `image` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `laptop`
--

CREATE TABLE `laptop` (
  `computer_id` varchar(10) NOT NULL,
  `processor_speed` varchar(30) NOT NULL,
  `ram` varchar(10) NOT NULL,
  `hard_disk` varchar(20) NOT NULL,
  `weight` varchar(20) NOT NULL,
  `quantity` int(80) NOT NULL,
  `price` int(80) NOT NULL,
  `image` longblob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `nama` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(80) NOT NULL,
  `password` varchar(80) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`nama`, `alamat`, `email`, `username`, `password`) VALUES
('Jeremia Carlo', 'Jakarta', 'Jercarlo12@gmail.com', 'jercarlo1', 'jercarlo'),
('Ahmad Naufal', 'Katapang', 'Naufal123@gmail.com', 'Naufal12', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `desktop`
--
ALTER TABLE `desktop`
  ADD PRIMARY KEY (`computer_id`);

--
-- Indexes for table `laptop`
--
ALTER TABLE `laptop`
  ADD PRIMARY KEY (`computer_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `admin_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1302204086;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
