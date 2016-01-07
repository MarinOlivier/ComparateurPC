-- phpMyAdmin SQL Dump
-- version 4.2.5
-- http://www.phpmyadmin.net
--
-- Client :  localhost:8889
-- Généré le :  Jeu 07 Janvier 2016 à 18:32
-- Version du serveur :  5.5.38
-- Version de PHP :  5.5.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Base de données :  `projet_poo`
--

-- --------------------------------------------------------

--
-- Structure de la table `computer`
--

CREATE TABLE `computer` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `motherBoard` varchar(255) DEFAULT NULL,
  `CPU` varchar(255) DEFAULT NULL,
  `RAM` varchar(255) DEFAULT NULL,
  `GPU` varchar(255) DEFAULT NULL,
  `ROM` varchar(255) DEFAULT NULL,
  `powerSupply` varchar(255) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `RAM_freq` varchar(255) DEFAULT NULL,
  `CPU_freq` varchar(255) DEFAULT NULL,
  `GPU_freq` varchar(255) DEFAULT NULL,
  `GPU_RAM` varchar(255) DEFAULT NULL,
  `E_S` varchar(255) DEFAULT NULL,
  `case_pc` varchar(255) DEFAULT NULL,
  `airing` varchar(255) DEFAULT NULL,
  `OS` varchar(255) DEFAULT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `soundCard` varchar(255) DEFAULT NULL
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=193 ;

--
-- Contenu de la table `computer`
--

INSERT INTO `computer` (`id`, `name`, `motherBoard`, `CPU`, `RAM`, `GPU`, `ROM`, `powerSupply`, `price`, `RAM_freq`, `CPU_freq`, `GPU_freq`, `GPU_RAM`, `E_S`, `case_pc`, `airing`, `OS`, `brand`, `soundCard`) VALUES
  (1, 'PC7 BATTLEBOX™ TITAN Z EDITION', NULL, 'Intel Core i7', '32 Go', 'NVIDIA GeForce GTX TITAN X', '2 x SSD 1 To', NULL, '5 399€95', 'PC4-17000 - DDR4 2133 MHz', '3 GHz', NULL, '12 Go', '1 x Audio numerique S/PDIF Optique. 2 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stereo. 6 x USB 3.0. 2 x USB 3.1', NULL, NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL),
  (2, 'PC10 BATTLEBOX™ TITAN Z EDITION', NULL, 'Intel Core i7', '32 Go', 'NVIDIA GeForce GTX TITAN X', '2 x SSD 1 To', NULL, '5 299€95', 'PC4-17000 - DDR4 2133 MHz', '3 GHz', NULL, '12 Go', '1 x Audio numerique S/PDIF Optique. 2 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stereo. 6 x USB 3.0. 2 x USB 3.1', NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'LDLC', NULL),
  (3, 'PC7 MAX4K', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980', 'SSD 512 Go', NULL, '3 249€95', NULL, '3 GHz', NULL, '4 Go', '1 x Audio numerique S/PDIF Optique. 1 x HDMI Femelle. 2 x DVI Femelle. 2 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stereo. 6 x USB 3.0. 1 x DisplayPort Femelle. 2 x USB 3.1', NULL, NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL),
  (4, 'PC10 MAX4K', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980', 'SSD 512 Go', NULL, '3 199€95', NULL, '3 GHz', NULL, '4 Go', '1 x Audio numerique S/PDIF Optique. 1 x HDMI Femelle. 2 x DVI Femelle. 2 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stereo. 6 x USB 3.0. 1 x DisplayPort Femelle. 2 x USB 3.1', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (5, 'PC10 PHANTOM', NULL, 'Intel Core i7', '16 Go', '2 x NVIDIA GeForce GTX 980', 'SSD 512 Go', NULL, '3 199€95', 'PC4-17000 - DDR4 2133 MHz', '3.5 GHz', NULL, '6 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (6, 'PC7 PHANTOM', NULL, 'Intel Core i7', '16 Go', '2 x NVIDIA GeForce GTX 980', 'SSD 512 Go', NULL, '3 189€95', 'PC4-17000 - DDR4 2133 MHz', '3.5 GHz', NULL, '6 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (7, 'PC7 BATTLEBOX TITAN Z LITE', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', 'SSD 512 Go', NULL, '2 999€95', NULL, '3.5 GHz', NULL, '6 Go', '1 x Audio numerique S/PDIF Optique. 1 x HDMI Femelle. 2 x DVI Femelle. 2 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stereo. 6 x USB 3.0. 1 x DisplayPort Femelle. 2 x USB 3.1', NULL, NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL),
  (8, 'PC10 BATTLEBOX TITAN Z LITE', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', 'SSD 512 Go', NULL, '2 989€95', NULL, '3.5 GHz', NULL, '6 Go', '1 x Audio numerique S/PDIF Optique. 1 x HDMI Femelle. 2 x DVI Femelle. 2 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stereo. 6 x USB 3.0. 1 x DisplayPort Femelle. 2 x USB 3.1', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (9, 'PC7 ULTIMATE LIMITED EDITION', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 780 Ti', 'SSD 512 Go', NULL, '2 959€95', 'PC3-14900 - DDR3 1866 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (10, 'PC10 ULTIMATE LIMITED EDITION', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 780 Ti', 'SSD 512 Go', NULL, '2 949€95', 'PC3-14900 - DDR3 1866 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (11, 'PC10 BATTLEBOX™ V2', NULL, 'Intel Core i7', '16 Go', '2 x NVIDIA GeForce GTX 970', 'SSD 512 Go', NULL, '2 899€95', 'PC4-22400 - DDR4 2800 MHz', '4 GHz', NULL, '6 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'LDLC', NULL),
  (12, 'PC7 BATTLEBOX™ V2', NULL, 'Intel Core i7', '16 Go', '2 x NVIDIA GeForce GTX 970', 'SSD 512 Go', NULL, '2 899€95', 'PC4-22400 - DDR4 2800 MHz', '4 GHz', NULL, '6 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL),
  (13, 'PC7 ULTIMATE', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980', 'SSD 512 Go', NULL, '2 499€95', 'PC3-14900 - DDR3 1866 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (14, 'PC10 ULTIMATE', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980', 'SSD 512 Go', NULL, '2 489€95', 'PC3-14900 - DDR3 1866 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (15, 'PC10 STREAM', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', '500 Go', NULL, '2 459€95', 'PC4-22400 - DDR4 2800 MHz', '4 GHz', NULL, '6 Go', '0', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (16, 'PC7 STREAM', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', '500 Go', NULL, '2 459€95', 'PC4-22400 - DDR4 2800 MHz', '4 GHz', NULL, '6 Go', '0', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (17, 'AG270 2QC 3K-002EU', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 970M', NULL, NULL, '2 399€95', 'PC3-12800 - DDR3 1600 MHz', '2.5 GHz', NULL, '6 Go', NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL),
  (18, 'PC STREAM', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', '500 Go', NULL, '2 349€95', 'PC3-22400 - DDR3 2800 MHz', '4 GHz', NULL, '6 Go', '0', NULL, NULL, 'Aucun', 'LDLC', NULL),
  (19, 'PC7 NEXTGEN', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 970', 'SSD 512 Go', NULL, '2 199€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (20, 'PC10 NEXTGEN', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 970', 'SSD 512 Go', NULL, '2 189€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (21, 'HFR_PUSER_PLUS_7', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', NULL, NULL, '2 149€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, '6 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'HardWare.fr', NULL),
  (22, 'HFR_PUSER_PLUS_10', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', NULL, NULL, '2 139€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, '6 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL),
  (23, 'AG270 2QL-210EU', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 960M', NULL, NULL, '1 999€95', 'PC3-12800 - DDR3 1600 MHz', '2.4 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL),
  (24, '30A70035FR', NULL, 'Intel Xeon E5', '8 Go', NULL, NULL, NULL, '1 998€93', 'PC4-17000 - DDR4 2133 MHz', '3.5 GHz', NULL, NULL, '1 x RJ45. 1 x Serie (RS-232). 4 x USB 2.0. 2 x MiniDin 6 Femelle (PS/2). 1 x Jack 3.5mm Femelle Stereo. 4 x USB 3.0', NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Lenovo', NULL),
  (25, 'PC7 SPIRIT', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', NULL, '1 939€95', 'PC4-17000 - DDR4 2133 MHz', '3.3 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (26, 'PC10 SPIRIT', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', NULL, '1 929€95', 'PC4-17000 - DDR4 2133 MHz', '3.3 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (27, 'PC10 MAX4K LITE', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 240 Go', NULL, '1 669€95', 'PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (28, 'PC7 MAX4K LITE', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 240 Go', NULL, '1 669€95', 'PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (29, 'PC7 REVOLUTION', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 240 Go', NULL, '1 559€95', '2 x PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (30, 'PC10 REVOLUTION', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 240 Go', NULL, '1 539€95', '2 x PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (31, 'PC10 REVOLUTION BLANC', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 240 Go', NULL, '1 539€95', '2 x PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (32, 'LDLC PC10 REVOLUTION ROUGE', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 240 Go', NULL, '1 539€95', '2 x PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (33, 'PC10 PLUS PERFECT', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', NULL, '1 499€95', '2 x PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', 'Non', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (34, 'PC7 PLUS PERFECT', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', NULL, '1 499€95', '2 x PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (35, 'B85C-084EU', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', NULL, NULL, '1 499€95', NULL, '3.6 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL),
  (36, 'DT.SQYEF.131', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 980', '1 To', NULL, '1 479€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'Acer', NULL),
  (37, 'HFR_PUSER_GPUFLEX_7', NULL, 'Intel Core i7', '16 Go', 'Intel HD Graphics 530', NULL, NULL, '1 439€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, NULL, 'Power User', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'HardWare.fr', NULL),
  (38, 'REVOLUTION', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 240 Go', NULL, '1 439€95', '2 x PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Aucun', 'LDLC', NULL),
  (39, 'HFR_PGAMING_7', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, NULL, '1 429€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, '4 Go', 'Moyen Tour', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'HardWare.fr', NULL),
  (40, 'HFR_PUSER_GPUFLEX_10', NULL, 'Intel Core i7', '16 Go', 'Intel HD Graphics 530', NULL, NULL, '1 429€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, NULL, 'Power User', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL),
  (41, 'HFR_PGAMING_10', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, NULL, '1 419€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, '4 Go', 'Moyen Tour', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL),
  (42, 'PLUS PERFECT', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', NULL, '1 389€95', '2 x PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Aucun', 'LDLC', NULL),
  (43, 'PC7 SIRIUS', NULL, 'AMD FX 8-Core', '8 Go', 'AMD Radeon R9 390X', 'SSD 120 Go', NULL, '1 319€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, '8 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (44, 'PC10 SIRIUS', NULL, 'AMD FX 8-Core', '8 Go', 'AMD Radeon R9 390X', 'SSD 120 Go', NULL, '1 309€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, '8 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (45, 'HFR_PGAMING_MO', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, NULL, '1 299€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, '4 Go', 'Moyen Tour', NULL, NULL, 'Aucun', 'HardWare.fr', NULL),
  (46, '10CX002VFR', NULL, 'Intel Core i5', '8 Go', 'Intel HD Graphics 4600', 'SSD 180 Go', NULL, '1 299€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, NULL, '1 x HDMI Femelle. 4 x USB 2.0. 1 x RJ45 Femelle. 1 x HDMI Femelle (Entree)', NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Lenovo', NULL),
  (47, 'GAMING 24GE 2QE-003EU', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960M', NULL, NULL, '1 299€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, '2 Go', '10/100/1000 Mbps', NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL),
  (48, 'MI-014EU', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 960', NULL, NULL, '1 299€95', NULL, '3.2 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'MSI', NULL),
  (49, 'AG240 2PE-056EU', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 860M', NULL, NULL, '1 299€95', 'PC3-12800 - DDR3 1600 MHz', '2.6 GHz', NULL, '2 Go', '10/100/1000 Mbps', NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL),
  (50, 'HFR_PUSER_GPUFLEX_KIT', NULL, 'Intel Core i7', '16 Go', 'Intel HD Graphics 530', NULL, NULL, '1 259€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, NULL, 'Power User', NULL, NULL, 'Aucun', 'HardWare.fr', NULL),
  (51, 'PC7 PERFECT', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', NULL, '1 259€95', '2 x PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (52, 'VISION X 471 B/B', NULL, 'Intel Core i7', '8 Go', 'AMD Radeon R9 M270X', 'SSD 256 Go', NULL, '1 249€96', 'PC3-12800 - DDR3 1600 MHz', '2.3 GHz', NULL, '1 Go', '1 x Serial ATA', NULL, NULL, 'Aucun', 'ASRock', NULL),
  (53, 'HFR_PGAMING_KIT', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, NULL, '1 249€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Aucun', 'HardWare.fr', NULL),
  (54, 'PC10 PERFECT', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', NULL, '1 249€95', '2 x PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (55, 'AG240 2PE-057EU', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 860M', NULL, NULL, '1 249€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, '2 Go', '10/100/1000 Mbps', NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL),
  (56, 'PC10 MOBA', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '500 Go', NULL, '1 209€95', 'PC3-14900 - DDR3 1866 MHz', '3.5 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (57, 'ET2311IUTH-BF015T', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', '1 To', NULL, '1 199€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'ASUS', NULL),
  (58, '30AH0059FR', NULL, 'Intel Core i7', '8 Go', 'Intel HD Graphics 4600', NULL, NULL, '1 195€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Lenovo', NULL),
  (59, 'PC10 ZI-ARTIST LE', NULL, 'Intel Core i7', '8 Go', 'Intel HD Graphics 530', 'SSD 120 Go', NULL, '1 189€95', 'PC3-12800 - DDR3 1600 MHz', '3.4 GHz', NULL, NULL, 'Non', NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'LDLC', NULL),
  (60, 'LDLC PC7 PUREKILLER SE', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', '1 To', NULL, '1 109€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', '3', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (61, 'PERFECT', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', NULL, '1 099€95', '2 x PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Aucun', 'LDLC', NULL),
  (62, 'PC SIRIUS', NULL, 'AMD FX 8-Core', '8 Go', 'AMD Radeon R9 390X', '1 To', NULL, '1 099€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, '8 Go', '6', NULL, NULL, 'Aucun', 'LDLC', NULL),
  (63, 'PC10 PUREKILLER SE', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', '1 To', NULL, '1 099€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', '3', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (64, 'PC7 E-WOKE', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 950', 'SSD 256 Go', NULL, '1 099€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (65, '30AH005MFR', NULL, 'Intel Xeon E3', '8 Go', 'Intel HD Graphics P4600', NULL, NULL, '1 099€95', 'PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Lenovo', NULL),
  (66, 'HFR_PGAMING_GPUFLEX_10', NULL, 'Intel Core i5', '8 Go', 'Intel HD Graphics 530', NULL, NULL, '1 089€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL),
  (67, 'LDLC PC10 E-WOKE', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 950', 'SSD 256 Go', NULL, '1 089€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (68, 'PC7 ZI-ARTIST', NULL, 'Intel Core i7', '8 Go', 'Intel HD Graphics 530', 'SSD 120 Go', NULL, '1 079€95', 'PC3-12800 - DDR3 1600 MHz', '3.4 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL),
  (69, 'PC10 ZI-ARTIST', NULL, 'Intel Core i7', '8 Go', 'Intel HD Graphics 530', 'SSD 120 Go', NULL, '1 069€95', 'PC3-12800 - DDR3 1600 MHz', '3.4 GHz', NULL, NULL, 'Non', NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'LDLC', NULL),
  (70, 'PC MOBA', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '500 Go', NULL, '1 059€95', 'PC3-14900 - DDR3 1866 MHz', '3.5 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Aucun', 'LDLC', NULL),
  (71, 'PC7 FORCER', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', NULL, '1 059€95', '2 x PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (72, 'DT.VJEEF.092', NULL, 'Intel Core i7', '8 Go', 'Intel HD Graphics 4600', 'SSD 256 Go', NULL, '1 059€93', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Acer', NULL),
  (73, 'PC10 FORCER', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', NULL, '1 049€95', '2 x PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '2 Go', 'Non', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (74, 'PC7 METEOR', NULL, 'Intel Core i5', '8 Go', 'AMD Radeon R7 370', 'SSD 120 Go', NULL, '1 049€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '2 Go', '1 x Audio numerique S/PDIF Optique. 1 x HDMI Femelle. 1 x DVI Femelle. 2 x Gigabit Ethernet 10/100/1000 - RJ45 Femelle. 5 x Jack 3.5mm Femelle Stereo. 4 x USB 3.0. 1 x USB 3.1 Type C Femelle', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (75, 'HFR_GAMING_ULTRA_7', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, NULL, '1 029€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'HardWare.fr', NULL),
  (76, 'N9F31ET#ABF', NULL, 'Intel Core i5', '8 Go', 'Intel HD Graphics 4600', '1 To', NULL, '1 029€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, NULL, '1 x Serie (RS-232). 1 x DVI Femelle. 4 x USB 2.0. 2 x MiniDin 6 Femelle (PS/2). 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 3 x Jack 3.5mm Femelle Stereo. 2 x USB 3.0', NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'HP', NULL),
  (77, 'HFR_GAMING_ULTRA_10', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, NULL, '1 019€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL),
  (78, 'PC7 PUREKILLER', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', '1 To', NULL, '1 019€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', '1 x HDMI Femelle. 2 x DVI Femelle. 4 x USB 2.0. 2 x MiniDin 6 Femelle (PS/2). 3 x Jack 3.5mm Femelle Stereo. 2 x USB 3.0. 1 x DisplayPort Femelle', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (79, 'PC7 ESPORT BLAST', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 760', 'SSD 120 Go', NULL, '1 019€95', 'PC3-19200 - DDR3 2400 MHz', '3.2 GHz', NULL, '2 Go', '1 x Audio numerique S/PDIF Optique. 1 x HDMI Femelle. 2 x DVI Femelle. 2 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stereo. 4 x USB 3.0. 1 x DisplayPort Femelle. 1 x USB 3.1 Type C Femelle', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (80, 'PC10 PUREKILLER', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', '1 To', NULL, '1 009€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (81, 'PC10 ESPORT BLAST', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 760', 'SSD 120 Go', NULL, '1 009€95', 'PC4-19200 - DDR4 2400 MHz', '3.2 GHz', NULL, '2 Go', '1 x Audio numerique S/PDIF Optique. 1 x HDMI Femelle. 2 x DVI Femelle. 2 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stereo. 4 x USB 3.0. 1 x DisplayPort Femelle. 1 x USB 3.1 Type C Femelle', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (82, 'PC MAGNA', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 980', '1 To', NULL, '999€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Aucun', 'LDLC', NULL),
  (83, 'MI-017EU', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', NULL, NULL, '999€95', NULL, '2.9 GHz', NULL, NULL, '1 x RJ45. 1 x Audio numerique S/PDIF Optique. 1 x HDMI Femelle. 4 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 6 x Jack 3.5mm Femelle Stereo. 2 x USB 3.0. 1 x DisplayPort Femelle', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'MSI', NULL),
  (84, 'ET2311IUTH-BF020T', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', '500 Go', NULL, '995€95', 'PC3-12800 - DDR3 1600 MHz', '3 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'ASUS', NULL),
  (85, 'PC7 DRAWER', NULL, 'AMD FirePro APU', '8 Go', 'AMD FirePro A320', 'SSD 120 Go', NULL, '959€95', 'PC3-12800 - DDR3 1600 MHz', '3.8 GHz', NULL, NULL, '1', NULL, NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL),
  (86, 'PC E-WOKE', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 950', 'SSD 256 Go', NULL, '949€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Aucun', 'LDLC', NULL),
  (87, 'PC10 MAJOR LIMITED EDITION', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', NULL, '949€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (88, 'ZBOX-EN860-P-BE', NULL, 'Intel Core i5', NULL, 'NVIDIA GeForce GTX 860M', NULL, NULL, '949€95', 'PC3-12800 - DDR3 1600 MHz', '1.7 GHz', NULL, NULL, NULL, NULL, NULL, NULL, 'ZOTAC', NULL),
  (89, 'PC10SAGA-B150-I5-8-H1-W10H', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', NULL, '899€95', 'PC3-10600 - DDR3 1333 MHz', '2.7 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (90, 'PC10 FORTRESS', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', NULL, '899€95', 'PC3-10600 - DDR3 1333 MHz', '2.7 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (91, 'ZI-ARTIST', NULL, 'Intel Core i7', '8 Go', 'Intel HD Graphics 530', 'SSD 120 Go', NULL, '889€95', 'PC3-12800 - DDR3 1600 MHz', '3.4 GHz', NULL, NULL, NULL, NULL, NULL, 'Aucun', 'LDLC', NULL),
  (92, 'ADORA22 2M-064EU', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4600', '1 To', NULL, '879€95', 'PC3-12800 - DDR3 1600 MHz', '2.4 GHz', NULL, NULL, NULL, NULL, NULL, 'Aucun', 'MSI', NULL),
  (93, 'A6410-BC022T', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4400', NULL, NULL, '878€96', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, NULL, '1 x HDMI Femelle. 2 x USB 2.0. 1 x RJ45 Femelle. 2 x USB 3.0. 1 x HDMI Femelle (Entree)', NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'ASUS', NULL),
  (94, 'LDLC PC BRIX-I7-4-S1H10-W7', NULL, 'Intel Core i7', '4 Go', 'Intel HD Graphics 5500', 'SSD 128 Go', NULL, '869€95', 'PC3-12800 - DDR3 1600 MHz', '2.4 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (95, 'DT.VJEEF.093', NULL, 'Intel Core i5', '8 Go', 'Intel HD Graphics 4600', 'SSD 128 Go', NULL, '859€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Acer', NULL),
  (96, 'LDLC PC BRIX-I7-4-S1H10-W10', NULL, 'Intel Core i7', '4 Go', 'Intel HD Graphics 5500', 'SSD 128 Go', NULL, '859€95', 'PC3-12800 - DDR3 1600 MHz', '2.4 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (97, 'PC PUREKILLER', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', '1 To', NULL, '859€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', '1 x HDMI Femelle. 2 x DVI Femelle. 4 x USB 2.0. 2 x MiniDin 6 Femelle (PS/2). 3 x Jack 3.5mm Femelle Stereo. 2 x USB 3.0. 1 x DisplayPort Femelle', NULL, NULL, 'Aucun', 'LDLC', NULL),
  (98, 'PC7-MAJOR', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 760', '1 To', NULL, '859€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '2 Go', '1 x HDMI Femelle. DVI Femelle. 6 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 6 x Jack 3.5mm Femelle Stereo. 2 x USB 3.0', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (99, 'PC7 NEXTREME', NULL, 'AMD FX 8-Core', '8 Go', 'AMD Radeon R9 380', '1 To', NULL, '859€95', 'PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (100, 'PC7 PAINTER', NULL, 'AMD FirePro APU', '4 Go', 'AMD FirePro A320', '500 Go', NULL, '859€95', 'PC3-12800 - DDR3 1600 MHz', '3.8 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL),
  (101, 'ADORA22 2M-058EU', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4600', '1 To', NULL, '859€95', 'PC3-12800 - DDR3 1600 MHz', '2.4 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL),
  (102, 'HFR_GAMING_ULTRA_KIT', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, NULL, '849€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Aucun', 'HardWare.fr', NULL),
  (103, 'J4B02EA#ABF', NULL, 'Intel Core i7', '8 Go', 'Intel HD Graphics 4600', '1 To', NULL, '849€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, '1 x Serie (RS-232). 1 x DVI Femelle. 4 x USB 2.0. 2 x MiniDin 6 Femelle (PS/2). 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 3 x Jack 3.5mm Femelle Stereo', NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'HP', NULL),
  (104, 'PC10-MAJOR', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 760', '1 To', NULL, '849€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '2 Go', '1 x HDMI Femelle. DVI Femelle. 6 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 6 x Jack 3.5mm Femelle Stereo. 2 x USB 3.0', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (105, 'PC10 NEXTREME', NULL, 'AMD FX 8-Core', '8 Go', 'AMD Radeon R9 380', '1 To', NULL, '849€95', 'PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (106, '10DS0005FR', NULL, 'Intel Core i7', '8 Go', 'Intel HD Graphics 4600', NULL, NULL, '849€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, NULL, '1 x Serie (RS-232). 2 x USB 2.0. 1 x Port Parallèle. 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 3 x Jack 3.5mm Femelle Stereo. 1 x DisplayPort. 2 x USB 3.0', NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'Lenovo', NULL),
  (107, 'PC7 D-SIGN', NULL, 'Intel Core i5', '4 Go', 'NVIDIA Quadro K620', '1 To', NULL, '839€95', 'PC3-10600 - DDR3 1333 MHz', '3 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL),
  (108, 'ET2323INK-BC026Q', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 5500', NULL, NULL, '829€95', 'PC3-12800 - DDR3 1600 MHz', '2.1 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'ASUS', NULL),
  (109, 'PRO24 2M-008XEU', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', NULL, NULL, '829€95', NULL, '2.9 GHz', NULL, NULL, NULL, NULL, NULL, 'Aucun', 'MSI', NULL),
  (110, 'A6410-BC046T', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', NULL, NULL, '823€95', 'PC3-12800 - DDR3 1600 MHz', '3 GHz', NULL, NULL, '1 x HDMI Femelle. 2 x USB 2.0. 1 x RJ45 Femelle. 2 x USB 3.0. 1 x HDMI Femelle (Entree)', NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'ASUS', NULL),
  (111, 'A4310-BB021T', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', NULL, NULL, '819€95', 'PC3-12800 - DDR3 1600 MHz', '1.9 GHz', NULL, NULL, '1 x Serie (RS-232). 2 x USB 2.0. 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle', NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'ASUS', NULL),
  (112, 'F0B100HJFR', NULL, 'Intel Core i5', '4 Go', 'NVIDIA GeForce 820A', NULL, NULL, '819€95', NULL, '2.2 GHz', NULL, '1 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'Lenovo', NULL),
  (113, 'PC MAJOR LIMITED EDITION', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', NULL, '799€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Aucun', 'LDLC', NULL),
  (114, '10C20003FR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', NULL, NULL, '799€95', 'PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, NULL, '0', NULL, NULL, 'Microsoft Windows 8 Pro 64 bits', 'Lenovo', NULL),
  (115, '9S6-ACB111-055', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4600', '500 Go', NULL, '799€95', 'PC3-12800 - DDR3 1600 MHz', '2.4 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'MSI', NULL),
  (116, 'K4S84EA#ABF', NULL, 'Intel Core i5', '6 Go', 'NVIDIA GeForce GTX 745', '3 To', NULL, '779€95', NULL, '2.9 GHz', NULL, '4 Go', '1 x HDMI Femelle. 1 x DVI Femelle. 4 x USB 2.0. 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stereo. 2 x USB 3.0. 1 x DisplayPort Femelle', NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'HP', NULL),
  (117, '10E2001NFR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', NULL, NULL, '769€95', 'PC3-12800 - DDR3 1600 MHz', '1.7 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Lenovo', NULL),
  (118, 'HFR_GAMING_10', NULL, 'Intel Core i3', '4 Go', 'NVIDIA GeForce GTX 950', NULL, NULL, '749€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL),
  (119, 'HFR_GAMING_PLUS_MO', NULL, 'Intel Core i5', '8 Go', 'AMD Radeon R9 380', NULL, NULL, '749€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Aucun', 'HardWare.fr', NULL),
  (120, 'HFR_GAMING_PLUS_KIT', NULL, 'Intel Core i5', '8 Go', 'AMD Radeon R9 380', NULL, NULL, '699€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Aucun', 'HardWare.fr', NULL),
  (121, 'MAJOR', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 760', '1 To', NULL, '699€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Aucun', 'LDLC', NULL),
  (122, 'HFR_GAMING_GPUFLEX_7', NULL, 'Intel Core i5', '8 Go', 'Intel HD Graphics 4600', NULL, NULL, '689€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, NULL, 'Gaming', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'HardWare.fr', NULL),
  (123, 'HFR_GAMING_GPUFLEX_10', NULL, 'Intel Core i5', '8 Go', 'Intel HD Graphics 4600', NULL, NULL, '679€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, NULL, 'Gaming', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL),
  (124, 'LDLC PC BRIX-I5-4-S1H10-W7', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 5500', 'SSD 128 Go', NULL, '679€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (125, 'LDLC PC BRIX-I5-4-S1H10-W10', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 5500', 'SSD 128 Go', NULL, '669€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (126, 'PC7 ALLIANCE', NULL, 'AMD A10 Quad-Core APU', '8 Go', 'AMD Radeon R7', 'SSD 120 Go', NULL, '669€95', 'PC3-17066 - DDR3 2133 MHz', '3.7 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (127, 'PC10 ALLIANCE', NULL, 'AMD A10 Quad-Core APU', '8 Go', 'AMD Radeon R7', 'SSD 120 Go', NULL, '659€95', 'PC3-17066 - DDR3 2133 MHz', '3.7 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (128, 'HAZMAX EDITION NOEL', NULL, 'Intel Core i3', '4 Go', 'NVIDIA GeForce GTX 950', '1 To', NULL, '659€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (129, 'PC7 HAZMAX', NULL, 'Intel Core i3', '4 Go', 'NVIDIA GeForce GTX 950', '1 To', NULL, '659€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (130, '10DU000SFR', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', '500 Go', NULL, '658€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'Lenovo', NULL),
  (131, 'PC10 HAZMAX', NULL, 'Intel Core i3', '4 Go', 'NVIDIA GeForce GTX 950', '1 To', NULL, '649€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (132, '10AY003WFR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', '500 Go', NULL, '649€95', 'PC3-12800 - DDR3 1600 MHz', '3 GHz', NULL, NULL, 'Filaire', NULL, NULL, 'Microsoft Windows 8 Pro 64 bits', 'Lenovo', NULL),
  (133, 'PRO24 2M-002XEU', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', NULL, NULL, '649€95', NULL, '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Aucun', 'MSI', NULL),
  (134, 'LDLC PC BRIX-I5-4-H10-W7', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 5500', '1 To', NULL, '645€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, 'Non', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (135, 'VFY:P0420P751OFR', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', '500 Go', NULL, '639€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'Fujitsu', NULL),
  (136, 'LDLC PC BRIX-I5-4-H10-W10', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 5500', '1 To', NULL, '635€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, 'Non', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (137, 'HFR_GAMING_MO', NULL, 'Intel Core i3', '4 Go', 'NVIDIA GeForce GTX 950', NULL, NULL, '629€95', 'PC3-10600 - DDR3 1333 MHz', '3.6 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Aucun', 'HardWare.fr', NULL),
  (138, 'T4R58ET#ABF', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 530', '500 Go', NULL, '629€95', 'PC4-17000 - DDR4 2133 MHz', '3.2 GHz', NULL, NULL, NULL, NULL, NULL, 'Free DOS', 'HP', NULL),
  (139, 'N9E72ET#ABF', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', '500 Go', NULL, '629€95', 'PC3-12800 - DDR3 1600 MHz', '3 GHz', NULL, NULL, '1 x Serie (RS-232). 6 x USB 2.0. 2 x MiniDin 6 Femelle (PS/2). 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 2 x Jack 3.5mm Femelle Stereo. 1 x DisplayPort Femelle', NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'HP', NULL),
  (140, 'D-SIGN', NULL, 'Intel Core i5', '4 Go', 'NVIDIA Quadro K620', '1 To', NULL, '629€95', 'PC3-10600 - DDR3 1333 MHz', '3 GHz', NULL, '2 Go', 'Moyen Tour', NULL, NULL, 'Aucun', 'LDLC', NULL),
  (141, 'AE200 5M-216EU', NULL, 'AMD E2 Quad-Core APU', '4 Go', 'AMD Radeon R2', NULL, NULL, '629€95', NULL, '1.5 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL),
  (142, 'ZBOX-MA760-P-BE', NULL, 'AMD FX Quad-Core', NULL, 'AMD Radeon R7', NULL, NULL, '627€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, '0', NULL, NULL, NULL, 'ZOTAC', NULL),
  (143, 'LDLC PC BRIX-I5-4-S1-W7', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 5500', 'SSD 128 Go', NULL, '619€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, 'Non', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (144, 'PC7 ABADDON', NULL, 'AMD A10 Quad-Core APU', '8 Go', 'AMD Radeon R7', '1 To', NULL, '619€95', 'PC3-17066 - DDR3 2133 MHz', '3.5 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (145, 'PC7 VEGA', NULL, 'AMD A10 Quad-Core APU', '4 Go', 'AMD Radeon R7', 'SSD 120 Go', NULL, '619€95', 'PC3-12800 - DDR3 1600 MHz', '3.9 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (146, 'LDLC PC BRIX-I5-4-S1-W10', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 5500', 'SSD 128 Go', NULL, '609€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, 'Non', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (147, '10DS000HFR', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', '500 Go', NULL, '609€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'Lenovo', NULL),
  (148, 'X5040TA BLACK', NULL, 'Intel Celeron', '4 Go', 'Intel HD Graphics', '500 Go', NULL, '608€95', 'PC3-12800 - DDR3 1600 MHz', '1.4 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'Shuttle', NULL),
  (149, 'PC SKYMAX', NULL, 'Intel Core i3', '8 Go', 'NVIDIA GeForce GTX 950', '1 To', NULL, '599€95', 'PC3-12800 - DDR3 1600 MHz', '3.7 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Aucun', 'LDLC', NULL),
  (150, 'PC10 ABADDON', NULL, 'AMD A10 Quad-Core APU', '8 Go', 'AMD Radeon R7', '1 To', NULL, '599€95', 'PC3-17066 - DDR3 2133 MHz', '3.5 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (151, 'UN62 I5 - FULL SPEC', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4400', 'SSD 128 Go', NULL, '579€95', 'PC3-12800 - DDR3 1600 MHz', '1.7 GHz', NULL, NULL, '1 x RJ45. 1 x HDMI Femelle. 1 x Jack 3.5mm Femelle Stereo. 2 x USB 3.0. 1 x DisplayPort Femelle', NULL, NULL, 'Aucun', 'ASUS', NULL),
  (152, 'HFR_GAMING_KIT', NULL, 'Intel Core i3', '4 Go', 'NVIDIA GeForce GTX 950', NULL, NULL, '579€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Aucun', 'HardWare.fr', NULL),
  (153, 'PC10 ARTIST', NULL, 'Intel Pentium', '4 Go', 'NVIDIA GeForce GT 730', '500 Go', NULL, '569€95', 'PC3-10600 - DDR3 1333 MHz', '3.1 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'LDLC', NULL),
  (154, 'AP200-208XEU', NULL, 'Intel Pentium', '4 Go', 'Intel HD Graphics', NULL, NULL, '569€95', NULL, '3.2 GHz', NULL, NULL, NULL, NULL, NULL, 'Aucun', 'MSI', NULL),
  (155, 'HFR_GAMING_GPUFLEX_MO', NULL, 'Intel Core i5', '8 Go', 'Intel HD Graphics 4600', NULL, NULL, '559€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, NULL, 'Gaming', NULL, NULL, 'Aucun', 'HardWare.fr', NULL),
  (156, 'E810-B1494', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', NULL, NULL, '549€95', 'PC3-12800 - DDR3 1600 MHz', '3 GHz', NULL, NULL, 'RF (ondes radio)', NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'ASUS', NULL),
  (157, 'LDLC PC BRIX-I3-4-S1H10-W10', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 5500', 'SSD 128 Go', NULL, '549€95', 'PC3-12800 - DDR3 1600 MHz', '2.1 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (158, 'PC ORIGIN', NULL, 'AMD FX Quad-Core', '4 Go', 'AMD Radeon R7 370', '1 To', NULL, '549€95', 'PC3-12800 - DDR3 1600 MHz', '3.8 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Aucun', 'LDLC', NULL),
  (159, '10DU0003FR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', '500 Go', NULL, '549€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'Lenovo', NULL),
  (160, '10DS0008FR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', '500 Go', NULL, '549€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'Lenovo', NULL),
  (161, 'AP16FLEX-020EU', NULL, 'Intel Celeron', '4 Go', 'Intel HD Graphics', NULL, NULL, '549€95', 'PC3-10600 - DDR3 1333 MHz', '2 GHz', NULL, NULL, '2 x USB 2.0. 1 x RJ45 Femelle', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'MSI', NULL),
  (162, 'DT.VLUEF.023', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', NULL, NULL, '539€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Acer', NULL),
  (163, 'VFY:E0420P735OFR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', NULL, NULL, '539€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'Fujitsu', NULL),
  (164, 'HFR_FAMILY_7', NULL, 'Intel Celeron', '4 Go', 'AMD Radeon R7 250', NULL, NULL, '539€95', 'PC3-10600 - DDR3 1333 MHz', '2.8 GHz', NULL, '1 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'HardWare.fr', NULL),
  (165, 'LDLC PC BRIX-I3-4-H10S-W7', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 5500', '1 To', NULL, '539€95', 'PC3-12800 - DDR3 1600 MHz', '2.1 GHz', NULL, NULL, 'Non', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (166, 'PC7 IMPAKT', NULL, 'AMD FX Quad-Core', '4 Go', 'AMD Radeon HD 5450', '500 Go', NULL, '539€95', '1 x PC3-10600 - DDR3 1333 MHz', '3.8 GHz', NULL, '1 Go', NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (167, 'D8100XA', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', 'SSD 120 Go', NULL, '538€95', NULL, '3.4 GHz', NULL, NULL, NULL, NULL, NULL, 'Aucun', 'Shuttle', NULL),
  (168, 'VFY:P0420P2331FR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', '500 Go', NULL, '535€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8 Pro 64 bits', 'Fujitsu', NULL),
  (169, 'N9E73ET#ABF', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4600', '500 Go', NULL, '535€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, '1 x Serie (RS-232). 1 x Line IN (Jack 3.5 mm Femelle). 1 x Line OUT (Jack 3.5mm Femelle). 6 x USB 2.0. 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 2 x PS/2. 1 x DisplayPort', NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'HP', NULL),
  (170, '10DU0015FR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', '500 Go', NULL, '535€95', 'PC3-12800 - DDR3 1600 MHz', '3.7 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'Lenovo', NULL),
  (171, 'POS X504 BLACK', NULL, 'Intel Celeron', '4 Go', 'Intel HD Graphics', 'SSD 60 Go', NULL, '529€96', 'PC3-12800 - DDR3 1600 MHz', '1.4 GHz', NULL, NULL, NULL, NULL, NULL, 'Aucun', 'Shuttle', NULL),
  (172, 'HFR_FAMILY_10', NULL, 'Intel Celeron', '4 Go', 'AMD Radeon R7 250', NULL, NULL, '529€95', 'PC3-10600 - DDR3 1333 MHz', '2.8 GHz', NULL, '1 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL),
  (173, 'LDLC PC BRIX-I3-4-H10S-W10', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 5500', '1 To', NULL, '529€95', 'PC3-12800 - DDR3 1600 MHz', '2.1 GHz', NULL, NULL, 'Non', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (174, 'LDLC PC BRIX-I5-4-S1H10', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 5500', 'SSD 128 Go', NULL, '529€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, NULL, NULL, NULL, 'Aucun', 'LDLC', NULL),
  (175, 'PC10 IMPAKT', NULL, 'AMD FX Quad-Core', '4 Go', 'AMD Radeon HD 5450', '500 Go', NULL, '529€95', '1 x PC3-10600 - DDR3 1333 MHz', '3.8 GHz', NULL, '1 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (176, '9S6-B084-023', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', NULL, NULL, '529€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'MSI', NULL),
  (177, 'DT.VLZEF.028', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', 'SSD 128 Go', NULL, '527€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, NULL, 'Filaire', NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Acer', NULL),
  (178, 'IN EXTENSOR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4000', '500 Go', NULL, '519€95', 'PC3-10600 - DDR3 1333 MHz', '3.6 GHz', NULL, NULL, 'Mini Tour', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (179, 'PC7 SSD-IN EXTENSOR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4000', 'SSD 120 Go', NULL, '519€95', 'PC3-10600 - DDR3 1333 MHz', '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (180, 'LDLC PC BRIX-I3-4-S1-W7', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 5500', 'SSD 128 Go', NULL, '509€95', 'PC3-12800 - DDR3 1600 MHz', '2.1 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (181, 'PC10 IN EXTENSOR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4000', '500 Go', NULL, '509€95', 'PC3-10600 - DDR3 1333 MHz', '3.6 GHz', NULL, NULL, 'Mini Tour', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (182, 'PC INITIO', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4000', 'SSD 120 Go', NULL, '499€95', 'PC3-10600 - DDR3 1333 MHz', '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'LDLC', NULL),
  (183, '10AY008JFR', NULL, 'Intel Pentium', '4 Go', 'Intel HD Graphics', '500 Go', NULL, '499€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, 'Oui', NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Lenovo', NULL),
  (184, 'L6Y14EA#ABF', NULL, 'AMD A6 Dual-Core APU', '4 Go', 'NVIDIA GeForce 705M', '1 To', NULL, '489€95', NULL, '3.9 GHz', NULL, '1 Go', NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'HP', NULL),
  (185, '10DU0009FR', NULL, 'Intel Pentium', '4 Go', 'Intel HD Graphics 4400', '500 Go', NULL, '485€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'Lenovo', NULL),
  (186, 'L3E24EA#ABF', NULL, 'Intel Pentium', '4 Go', 'Intel HD Graphics', '500 Go', NULL, '479€95', 'PC3-12800 - DDR3 1600 MHz', '1.7 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'HP', NULL),
  (187, 'LDLC PC BRIX-CEL3205-4-S1H10-W10', NULL, 'Intel Celeron', '4 Go', 'Intel HD Graphics', 'SSD 128 Go', NULL, '479€95', 'PC3-12800 - DDR3 1600 MHz', '1.5 GHz', NULL, NULL, '1 x HDMI Femelle. 1 x RJ45 Femelle. 1 x Mini DisplayPort. 2 x USB 3.0', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (188, 'PC7 1ST BOSS', NULL, 'AMD Athlon II X2 Dual-Core', '4 Go', 'AMD Radeon R7 240', '500 Go', NULL, '479€95', '1 x PC3-10600 - DDR3 1333 MHz', '3.2 GHz', NULL, '2 Go', 'HDMI Femelle. DVI Femelle. 4 x USB 2.0. 2 x MiniDin 6 Femelle (PS/2). VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 3 x Jack 3.5mm Femelle Stereo. 2 x USB 3.0', NULL, NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL),
  (189, 'VFY:P0420P2261FR', NULL, 'Intel Pentium', '4 Go', 'Intel HD Graphics', '500 Go', NULL, '469€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8 Pro 64 bits', 'Fujitsu', NULL),
  (190, 'LDLC PC BEEBOX-CEL3150-4-S1H10-W10', NULL, 'Intel Celeron', '4 Go', 'Intel HD Graphics', 'SSD 128 Go', NULL, '469€95', 'PC3-12800 - DDR3 1600 MHz', '1.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL),
  (191, 'LDLC PC BRIX-I5-4-S1', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 5500', 'SSD 128 Go', NULL, '469€95', 'PC3-12800 - DDR3 1600 MHz', '2.2 GHz', NULL, NULL, 'Non', NULL, NULL, 'Aucun', 'LDLC', NULL),
  (192, 'PC10 1ST BOSS', NULL, 'AMD Athlon II X2 Dual-Core', '4 Go', 'AMD Radeon R7 240', '500 Go', NULL, '469€95', '1 x PC3-10600 - DDR3 1333 MHz', '3.2 GHz', NULL, '2 Go', '4 x USB 2.0. 2 x MiniDin 6 Femelle (PS/2). VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 3 x Jack 3.5mm Femelle Stereo. 2 x USB 3.0', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `reserve`
--

CREATE TABLE `reserve` (
  `id_user` int(11) NOT NULL,
  `id_computeur` int(11) NOT NULL,
  `date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Index pour les tables exportées
--

--
-- Index pour la table `computer`
--
ALTER TABLE `computer`
ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `computer`
--
ALTER TABLE `computer`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=193;