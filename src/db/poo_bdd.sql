-- phpMyAdmin SQL Dump
-- version 4.2.5
-- http://www.phpmyadmin.net
--
-- Client :  localhost:8889
-- Généré le :  Mer 03 Février 2016 à 17:33
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
  `soundCard` varchar(255) DEFAULT NULL,
  `pict` varchar(255) DEFAULT NULL
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=156 ;

--
-- Contenu de la table `computer`
--

INSERT INTO `computer` (`id`, `name`, `motherBoard`, `CPU`, `RAM`, `GPU`, `ROM`, `powerSupply`, `price`, `RAM_freq`, `CPU_freq`, `GPU_freq`, `GPU_RAM`, `E_S`, `case_pc`, `airing`, `OS`, `brand`, `soundCard`, `pict`) VALUES
(1, 'PC7 BATTLEBOX™ TITAN Z EDITION', 'MSI X99A GAMING 7', 'Intel Core i7', '32 Go', 'NVIDIA GeForce GTX TITAN X', '2 x SSD 1 To', '1200 W', '5 399€95', 'PC4-17000 - DDR4 2133 MHz', '3 GHz', NULL, '12 Go', '1 x Audio numérique S/PDIF Optique. 2 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stéréo. 6 x USB 3.0. 2 x USB 3.1', 'Grand Tour', NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/58/43/LD0001584321_1.jpg'),
(2, 'PC10 BATTLEBOX™ TITAN Z EDITION', 'MSI X99A GAMING 7', 'Intel Core i7', '32 Go', 'NVIDIA GeForce GTX TITAN X', '2 x SSD 1 To', '1200 W', '5 299€95', 'PC4-17000 - DDR4 2133 MHz', '3 GHz', NULL, '12 Go', '1 x Audio numérique S/PDIF Optique. 2 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stéréo. 6 x USB 3.0. 2 x USB 3.1', 'Grand Tour', NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/58/43/LD0001584321_1_0001584534.jpg'),
(3, 'PC7 MAX4K', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980', 'SSD 512 Go', '1000 W', '3 249€95', NULL, '3 GHz', NULL, '4 Go', '1 x Audio numérique S/PDIF Optique. 1 x HDMI Femelle. 2 x DVI Femelle. 2 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stéréo. 6 x USB 3.0. 1 x DisplayPort Femelle. 2 x USB 3.1', 'Grand Tour', NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/02/41/34/LD0002413499_1.jpg'),
(4, 'PC10 MAX4K', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980', 'SSD 512 Go', '1000 W', '3 199€95', NULL, '3 GHz', NULL, '4 Go', '1 x Audio numérique S/PDIF Optique. 1 x HDMI Femelle. 2 x DVI Femelle. 2 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stéréo. 6 x USB 3.0. 1 x DisplayPort Femelle. 2 x USB 3.1', 'Grand Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/02/41/34/LD0002413479_1.jpg'),
(5, 'PC10 PHANTOM', NULL, 'Intel Core i7', '16 Go', '2 x NVIDIA GeForce GTX 980', 'SSD 512 Go', '850 W', '3 199€95', 'PC4-17000 - DDR4 2133 MHz', '3.5 GHz', NULL, '6 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/52/38/LD0001523873_1.jpg'),
(6, 'PC7 PHANTOM', NULL, 'Intel Core i7', '16 Go', '2 x NVIDIA GeForce GTX 980', 'SSD 512 Go', '850 W', '3 189€95', 'PC4-17000 - DDR4 2133 MHz', '3.5 GHz', NULL, '6 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/52/38/LD0001523877_1.jpg'),
(7, 'PC7 BATTLEBOX TITAN Z LITE', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', 'SSD 512 Go', '1000 W', '2 999€95', NULL, '3.5 GHz', NULL, '6 Go', '1 x Audio numérique S/PDIF Optique. 1 x HDMI Femelle. 2 x DVI Femelle. 2 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stéréo. 6 x USB 3.0. 1 x DisplayPort Femelle. 2 x USB 3.1', 'Moyen Tour', NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/02/40/89/LD0002408937_1.jpg'),
(8, 'PC10 BATTLEBOX TITAN Z LITE', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', 'SSD 512 Go', '1000 W', '2 989€95', NULL, '3.5 GHz', NULL, '6 Go', '1 x Audio numérique S/PDIF Optique. 1 x HDMI Femelle. 2 x DVI Femelle. 2 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stéréo. 6 x USB 3.0. 1 x DisplayPort Femelle. 2 x USB 3.1', 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/02/40/89/LD0002408961_1.jpg'),
(9, 'PC10 STREAM EDITION NOEL', 'ASUS MAXIMUS VIII RANGER', 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', '500 Go', '650 W', '2 549€95', 'PC4-22400 - DDR4 2800 MHz', '4 GHz', NULL, '6 Go', '0', 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/37/80/LD0003378007_1.jpg'),
(10, 'PC7 ULTIMATE', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980', 'SSD 512 Go', '750 W', '2 499€95', 'PC3-14900 - DDR3 1866 MHz', '4 GHz', NULL, '4 Go', NULL, 'Grand Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/26/59/LD0003265947_1.jpg'),
(11, 'PC10 ULTIMATE', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980', 'SSD 512 Go', '750 W', '2 489€95', 'PC3-14900 - DDR3 1866 MHz', '4 GHz', NULL, '4 Go', NULL, 'Grand Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/26/59/LD0003265952_1.jpg'),
(12, 'PC10 STREAM', 'ASUS MAXIMUS VIII RANGER', 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', '500 Go', '650 W', '2 459€95', 'PC4-22400 - DDR4 2800 MHz', '4 GHz', NULL, '6 Go', '0', 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/24/86/LD0003248659_1.jpg'),
(13, 'AG270 2QC 3K-002EU', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 970M', NULL, '230 W', '2 399€95', 'PC3-12800 - DDR3 1600 MHz', '2.5 GHz', NULL, '6 Go', NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/01/60/85/LD0001608529_1_0002845679_0002958929.jpg'),
(14, 'PC STREAM', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', '500 Go', '650 W', '2 349€95', 'PC3-22400 - DDR3 2800 MHz', '4 GHz', NULL, '6 Go', '0', 'Moyen Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/24/86/LD0003248629_1.jpg'),
(15, 'PC7 NEXTGEN', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 970', 'SSD 512 Go', '650 W', '2 199€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, '4 Go', NULL, 'Grand Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/60/63/LD0001606342_1.jpg'),
(16, 'PC10 NEXTGEN', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 970', 'SSD 512 Go', '650 W', '2 189€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, '4 Go', NULL, 'Grand Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/60/63/LD0001606328_1.jpg'),
(17, 'HFR_PUSER_PLUS_7', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', NULL, '750 W', '2 079€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, '6 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/05/67/LD0002056702_1.jpg'),
(18, 'HFR_PUSER_PLUS_10', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', NULL, '750 W', '2 069€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, '6 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/05/67/LD0002056710_1.jpg'),
(19, 'HFR_PUSER_PLUS_MO', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', NULL, '750 W', '2 049€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, '6 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/05/67/LD0002056706_1.jpg'),
(20, 'AG270 2QL-210EU', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 960M', NULL, '230 W', '1 999€95', 'PC3-12800 - DDR3 1600 MHz', '2.4 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/01/60/85/LD0001608529_1_0002845679_0002958929_0003116575_0003354982.jpg'),
(21, '30A70035FR', NULL, 'Intel Xeon E5', '8 Go', NULL, NULL, '650 W', '1 998€93', 'PC4-17000 - DDR4 2133 MHz', '3.5 GHz', NULL, NULL, '1 x RJ45. 1 x Série (RS-232). 4 x USB 2.0. 2 x MiniDin 6 Femelle (PS/2). 1 x Jack 3.5mm Femelle Stéréo. 4 x USB 3.0', NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/02/84/57/LD0002845745_1_0003296473.jpg'),
(22, '24GE 2QE 4K-005EU', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 960M', NULL, '180 W', '1 949€95', 'PC3-12800 - DDR3 1600 MHz', '2.6 GHz', NULL, '2 Go', '10/100/1000 Mbps', NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/03/05/09/LD0003050950_1.jpg'),
(23, 'PC10 SPIRIT', 'ASUS X99-A', 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', '650 W', '1 929€95', 'PC4-17000 - DDR4 2133 MHz', '3.3 GHz', NULL, '4 Go', NULL, 'Grand Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/49/61/LD0001496182_1.jpg'),
(24, 'HFR_PUSER_PLUS_KIT', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 980 Ti', NULL, '750 W', '1 899€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, '6 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/05/67/LD0002056714_1.jpg'),
(25, 'HFR_PUSER_7', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 970', NULL, '750 W', '1 709€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/05/66/LD0002056690_1.jpg'),
(26, 'HFR_PUSER_10', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 970', NULL, '750 W', '1 699€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/05/66/LD0002056686_1.jpg'),
(27, 'PC7 REVOLUTION', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 240 Go', '650 W', '1 559€95', '2 x PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', NULL, 'Grand Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/37/90/LD0001379052_1.jpg'),
(28, 'PC10 PLUS PERFECT EDITION NOEL', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', '650 W', '1 549€95', '2 x PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', 'Filaire', 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/41/55/LD0003415537_1.jpg'),
(29, 'HFR_PUSER_KIT', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 970', NULL, '750 W', '1 529€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/05/66/LD0002056694_1.jpg'),
(30, 'PC7 PLUS PERFECT', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', '650 W', '1 499€95', '2 x PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/53/68/LD0001536848_1.jpg'),
(31, 'B85C-084EU', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', NULL, '600 W', '1 499€95', NULL, '3.6 GHz', NULL, '4 Go', NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/01/77/04/LD0001770457_1_0003316353.jpg'),
(32, 'HFR_PGAMING_7', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, '650 W', '1 419€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, '4 Go', 'Moyen Tour', 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/03/32/72/LD0003327204_1.jpg'),
(33, 'HFR_PGAMING_10', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, '650 W', '1 409€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, '4 Go', 'Moyen Tour', 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/03/32/71/LD0003327189_1.jpg'),
(34, 'PLUS PERFECT', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', '650 W', '1 389€95', '2 x PC3-12800 - DDR3 1600 MHz', '4 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/53/69/LD0001536908_1.jpg'),
(35, 'HFR_PUSER_GPUFLEX_7', NULL, 'Intel Core i7', '16 Go', 'Intel HD Graphics 530', NULL, '750 W', '1 369€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, NULL, 'Power User', 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/05/67/LD0002056718_1.jpg'),
(36, 'HFR_PUSER_GPUFLEX_10', NULL, 'Intel Core i7', '16 Go', 'Intel HD Graphics 530', NULL, '750 W', '1 359€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, NULL, 'Power User', 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/05/67/LD0002056722_1.jpg'),
(37, 'PC7 SIRIUS', NULL, 'AMD FX 8-Core', '8 Go', 'AMD Radeon R9 390X', 'SSD 120 Go', '500 W', '1 319€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/21/56/LD0003215610_1.jpg'),
(38, 'PC10 SIRIUS', NULL, 'AMD FX 8-Core', '8 Go', 'AMD Radeon R9 390X', 'SSD 120 Go', '500 W', '1 309€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/21/56/LD0003215615_1.jpg'),
(39, 'PC7 ZI-ARTIST LE', NULL, 'Intel Core i7', '16 Go', 'Intel HD Graphics 530', 'SSD 120 Go', '520 W', '1 299€95', 'PC3-12800 - DDR3 1600 MHz', '3.4 GHz', NULL, NULL, NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/32/51/LD0003325165_1.jpg'),
(40, '10CX002VFR', NULL, 'Intel Core i5', '8 Go', 'Intel HD Graphics 4600', 'SSD 180 Go', NULL, '1 299€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, NULL, '1 x HDMI Femelle. 4 x USB 2.0. 1 x RJ45 Femelle. 1 x HDMI Femelle (Entrée)', NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/01/49/25/LD0001492589_1_0003001131_0003262130.jpg'),
(41, 'AG240 2PE-056EU', NULL, 'Intel Core i7', '16 Go', 'NVIDIA GeForce GTX 860M', NULL, '150 W', '1 299€95', 'PC3-12800 - DDR3 1600 MHz', '2.6 GHz', NULL, '2 Go', '10/100/1000 Mbps', NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/03/35/68/LD0003356834_1.jpg'),
(42, 'MI-014EU', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 960', NULL, '350 W', '1 299€95', NULL, '3.2 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/03/31/69/LD0003316976_1.jpg'),
(43, 'HFR_PGAMING_MO', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, '650 W', '1 289€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, '4 Go', 'Moyen Tour', 'Moyen Tour', NULL, 'Aucun', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/03/32/71/LD0003327194_1.jpg'),
(44, 'PC7 PERFECT', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', '650 W', '1 259€95', '2 x PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/53/68/LD0001536888_1.jpg'),
(45, 'G1X32ET#ABF', NULL, 'Intel Core i7', '8 Go', 'Intel HD Graphics 4600', '1 To', '400 W', '1 249€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, NULL, 'Mini Tour', NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'HP', NULL, 'http://media.ldlc.com/ld/products/00/02/91/49/LD0002914975_1_0003169274.jpg'),
(46, 'PC10 PERFECT', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', 'SSD 120 Go', '650 W', '1 249€95', '2 x PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/54/85/LD0001548557_1.jpg'),
(47, 'AG240 2PE-057EU', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 860M', NULL, '150 W', '1 249€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, '2 Go', '10/100/1000 Mbps', NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/01/54/04/LD0001540475_1_0001657562_0002845631_0002893735.jpg'),
(48, 'HFR_PGAMING_KIT', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, '650 W', '1 239€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/03/32/72/LD0003327229_1.jpg'),
(49, 'HFR_PUSER_GPUFLEX_MO', NULL, 'Intel Core i7', '16 Go', 'Intel HD Graphics 530', NULL, '750 W', '1 239€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, NULL, 'Power User', 'Moyen Tour', NULL, 'Aucun', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/05/67/LD0002056726_1.jpg'),
(50, 'PC10 SKY-WOKE', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', 'SSD 250 Go', '450 W', '1 239€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, '2 Go', NULL, 'Mini Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/43/74/LD0003437486_1_0003437503.jpg'),
(51, 'PC7 MOBA', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '500 Go', '650 W', '1 219€95', 'PC3-14900 - DDR3 1866 MHz', '3.5 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/09/52/LD0003095247_1_0003095263.jpg'),
(52, 'AG220 2PE-025EU', NULL, 'Intel Core i7', '8 Go', 'NVIDIA GeForce GTX 860M', 'SSD 128 Go', '150 W', '1 219€95', 'PC3-12800 - DDR3 1600 MHz', '2.6 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/01/55/92/LD0001559202_1_0002066319_0003050488.jpg'),
(53, 'WM703ET#ABF', NULL, 'Intel Core i7', '4 Go', 'Intel HD Graphics 4600', '1 To', '240 W', '1 218€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'HP', NULL, 'http://media.ldlc.com/ld/products/00/03/48/82/LD0003488295_1.jpg'),
(54, 'GAMING 24GE 2QE-003EU', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960M', NULL, '150 W', '1 199€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, '2 Go', '10/100/1000 Mbps', NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/03/41/84/LD0003418467_1.jpg'),
(55, 'ZBOX-SN970-P-BE', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', '180 W', '1 199€95', NULL, '2.2 GHz', NULL, '2 Go', NULL, 'Mini PC', NULL, 'SteamOS', 'ZOTAC', NULL, 'http://media.ldlc.com/ld/products/00/03/42/55/LD0003425562_1.jpg'),
(56, '30AH0059FR', NULL, 'Intel Core i7', '8 Go', 'Intel HD Graphics 4600', NULL, '280 W', '1 195€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/01/64/70/LD0001647009_1_0002412897_0002887094.jpg'),
(57, 'HFR_PUSER_GPUFLEX_KIT', NULL, 'Intel Core i7', '16 Go', 'Intel HD Graphics 530', NULL, '750 W', '1 189€95', 'PC4-19200 - DDR4 2400 MHz', '4 GHz', NULL, NULL, 'Power User', 'Moyen Tour', NULL, 'Aucun', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/05/67/LD0002056730_1.jpg'),
(58, 'J9B44ET#ABF', NULL, 'Intel Xeon E3', '4 Go', 'Intel HD Graphics P4600', '500 Go', '240 W', '1 132€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'HP', NULL, 'http://media.ldlc.com/ld/products/00/03/48/82/LD0003488295_1_0003488539.jpg'),
(59, '10CX001HFR', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', '500 Go', NULL, '1 129€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/01/49/25/LD0001492589_1_0003001131.jpg'),
(60, 'PC SKY-WOKE', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', 'SSD 250 Go', '450 W', '1 099€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, '2 Go', NULL, 'Mini Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/43/74/LD0003437486_1.jpg'),
(61, 'PC7 E-WOKE', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 950', 'SSD 256 Go', '450 W', '1 099€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, '2 Go', NULL, 'Mini Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/77/11/LD0001771100_1_0001771503.jpg'),
(62, '30AH005MFR', NULL, 'Intel Xeon E3', '8 Go', 'Intel HD Graphics P4600', NULL, '280 W', '1 099€95', 'PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/01/64/70/LD0001647009_1_0002412897_0002887094_0003134412.jpg'),
(63, 'HFR_PGAMING_GPUFLEX_7', NULL, 'Intel Core i5', '8 Go', 'Intel HD Graphics 530', NULL, '650 W', '1 079€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, NULL, NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/03/32/72/LD0003327214_1.jpg'),
(64, 'HFR_PGAMING_GPUFLEX_10', NULL, 'Intel Core i5', '8 Go', 'Intel HD Graphics 530', NULL, '650 W', '1 069€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, NULL, NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/03/32/72/LD0003327209_1.jpg'),
(65, 'PC MOBA', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '500 Go', '650 W', '1 059€95', 'PC3-14900 - DDR3 1866 MHz', '3.5 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/09/52/LD0003095247_1.jpg'),
(66, 'PC7 FORCER', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', '620 W', '1 059€95', '2 x PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/55/51/LD0001555143_1.jpg'),
(67, 'DT.VJEEF.092', NULL, 'Intel Core i7', '8 Go', 'Intel HD Graphics 4600', 'SSD 256 Go', '500 W', '1 059€93', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Acer', NULL, 'http://media.ldlc.com/ld/products/00/03/03/12/LD0003031218_1_0003360365.jpg'),
(68, 'PC10 FORCER', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', '620 W', '1 049€95', '2 x PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '2 Go', 'Non', 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/55/51/LD0001555123_1.jpg'),
(69, 'AG220 2PE-029EU', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 860M', '1 To', '150 W', '1 049€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/01/55/92/LD0001559202_1_0002066319_0003050488_0003050656_0003291926.jpg'),
(70, 'ET2311IUTH-BF020T', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', '500 Go', '120 W', '1 029€95', 'PC3-12800 - DDR3 1600 MHz', '3 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'ASUS', NULL, 'http://media.ldlc.com/ld/products/00/01/46/94/LD0001469454_1_0002950907_0003105050_0003228254.jpg'),
(71, 'HFR_GAMING_ULTRA_7', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, '500 W', '1 029€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/90/92/LD0002909257_1.jpg'),
(72, 'HFR_GAMING_ULTRA_10', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, '500 W', '1 019€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/90/92/LD0002909252_1.jpg'),
(73, 'PC7 PUREKILLER', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', '1 To', '500 W', '1 019€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', '1 x HDMI Femelle. 2 x DVI Femelle. 4 x USB 2.0. 2 x MiniDin 6 Femelle (PS/2). 3 x Jack 3.5mm Femelle Stéréo. 2 x USB 3.0. 1 x DisplayPort Femelle', 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/41/54/LD0003415472_1.jpg'),
(74, 'PC7 ESPORT BLAST', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 760', 'SSD 120 Go', '450 W', '1 019€95', 'PC3-19200 - DDR3 2400 MHz', '3.2 GHz', NULL, '2 Go', '1 x Audio numérique S/PDIF Optique. 1 x HDMI Femelle. 2 x DVI Femelle. 2 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stéréo. 4 x USB 3.0. 1 x DisplayPort Femelle. 1 x USB 3.1 Type C Femelle', 'Mini PC', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/21/55/LD0003215580_1.jpg'),
(75, 'PC10 PUREKILLER', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', '1 To', '500 W', '1 009€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/41/54/LD0003415487_1.jpg'),
(76, 'PC10 ESPORT BLAST', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 760', 'SSD 120 Go', '450 W', '1 009€95', 'PC4-19200 - DDR4 2400 MHz', '3.2 GHz', NULL, '2 Go', '1 x Audio numérique S/PDIF Optique. 1 x HDMI Femelle. 2 x DVI Femelle. 2 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stéréo. 4 x USB 3.0. 1 x DisplayPort Femelle. 1 x USB 3.1 Type C Femelle', 'Mini PC', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/21/55/LD0003215585_1.jpg'),
(77, 'PC MAGNA', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 980', '1 To', '500 W', '999€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/38/33/LD0003383328_1.jpg'),
(78, 'ZI-ARTIST', NULL, 'Intel Core i7', '16 Go', 'Intel HD Graphics 530', '250 Go', '520 W', '999€95', 'PC3-12800 - DDR3 1600 MHz', '3.4 GHz', NULL, NULL, NULL, 'Moyen Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/32/25/LD0003322566_1.jpg'),
(79, 'MI-017EU', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', NULL, '350 W', '999€95', NULL, '2.9 GHz', NULL, NULL, '1 x RJ45. 1 x Audio numérique S/PDIF Optique. 1 x HDMI Femelle. 4 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 6 x Jack 3.5mm Femelle Stéréo. 2 x USB 3.0. 1 x DisplayPort Femelle', NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/03/31/69/LD0003316976_1_0003317316.jpg'),
(80, 'PC7 DRAWER', NULL, 'AMD FirePro APU', '8 Go', 'AMD FirePro A320', 'SSD 120 Go', '400 W', '959€95', 'PC3-12800 - DDR3 1600 MHz', '3.8 GHz', NULL, NULL, '1', 'Mini Tour', NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/02/99/87/LD0002998793_1.jpg'),
(81, 'HFR_PGAMING_GPUFLEX_MO', NULL, 'Intel Core i5', '8 Go', 'Intel HD Graphics 530', NULL, '650 W', '949€95', 'PC4-19200 - DDR4 2400 MHz', '3.5 GHz', NULL, NULL, NULL, 'Moyen Tour', NULL, 'Aucun', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/03/32/72/LD0003327219_1.jpg'),
(82, 'PC E-WOKE', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 950', 'SSD 256 Go', '450 W', '949€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, '2 Go', NULL, 'Mini Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/77/11/LD0001771100_1.jpg'),
(83, 'PC PUREKILLER SE', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', '1 To', '550 W', '949€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', '3', 'Moyen Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/35/87/LD0003358725_1.jpg'),
(84, 'PC10 DRAWER', NULL, 'AMD FirePro APU', '8 Go', 'AMD FirePro A320', 'SSD 120 Go', '400 W', '949€95', 'PC3-12800 - DDR3 1600 MHz', '3.8 GHz', NULL, NULL, '1', 'Mini Tour', NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/02/99/88/LD0002998808_1.jpg'),
(85, 'ZBOX-EN860-P-BE', NULL, 'Intel Core i5', NULL, 'NVIDIA GeForce GTX 860M', NULL, NULL, '949€95', 'PC3-12800 - DDR3 1600 MHz', '1.7 GHz', NULL, NULL, NULL, NULL, NULL, NULL, 'ZOTAC', NULL, 'http://media.ldlc.com/ld/products/00/02/93/20/LD0002932021_1_0002995073.jpg'),
(86, 'PC10 FORTRESS EDITION NOEL', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', '350 W', '929€95', 'PC3-10600 - DDR3 1333 MHz', '2.7 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/37/03/LD0003370351_1.jpg'),
(87, 'FORCER', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', '620 W', '899€95', '2 x PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '2 Go', 'Non', 'Moyen Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/55/56/LD0001555655_1.jpg'),
(88, 'PC10SAGA-B150-I5-8-H1-W10H', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', '350 W', '899€95', 'PC3-10600 - DDR3 1333 MHz', '2.7 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/44/11/LD0001441145_1_0003427587_0003428241.jpg'),
(89, 'PC7 FORTRESS', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', '350 W', '879€95', 'PC3-10600 - DDR3 1333 MHz', '2.7 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/44/11/LD0001441145_1_0001441211.jpg'),
(90, 'ADORA22 2M-064EU', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4600', '1 To', '90 W', '879€95', 'PC3-12800 - DDR3 1600 MHz', '2.4 GHz', NULL, NULL, NULL, NULL, NULL, 'Aucun', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/03/18/32/LD0003183273_1.jpg'),
(91, 'V1F01EA#ABF', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 530', '1 To', '160 W', '859€95', 'PC4-17000 - DDR4 2133 MHz', '3.7 GHz', NULL, NULL, '1 x Line OUT (Jack 3.5mm Femelle). 1 x RJ45 Femelle. 1 x DisplayPort. 4 x USB 3.0', NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'HP', NULL, 'http://media.ldlc.com/ld/products/00/03/48/16/LD0003481617_1.jpg'),
(92, 'PC7-MAJOR', 'MSI B85-G43 GAMING', 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 760', '1 To', '400 W', '859€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '2 Go', '1 x HDMI Femelle. DVI Femelle. 6 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 6 x Jack 3.5mm Femelle Stéréo. 2 x USB 3.0', 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/38/94/LD0003389492_1.jpg'),
(93, 'PC7 NEXTREME', NULL, 'AMD FX 8-Core', '8 Go', 'AMD Radeon R9 380', '1 To', '500 W', '859€95', 'PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/49/47/LD0001494732_1_0001560936_0001561076_0001561128.jpg'),
(94, 'HFR_GAMING_ULTRA_KIT', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 970', NULL, '500 W', '849€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '4 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/90/92/LD0002909242_1.jpg'),
(95, 'J4B02EA#ABF', NULL, 'Intel Core i7', '8 Go', 'Intel HD Graphics 4600', '1 To', '300 W', '849€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, '1 x Série (RS-232). 1 x DVI Femelle. 4 x USB 2.0. 2 x MiniDin 6 Femelle (PS/2). 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 3 x Jack 3.5mm Femelle Stéréo', 'Mini Tour', NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'HP', NULL, 'http://media.ldlc.com/ld/products/00/03/21/55/LD0003215505_1.jpg'),
(96, 'PC10-MAJOR', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 760', '1 To', '400 W', '849€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '2 Go', '1 x HDMI Femelle. DVI Femelle. 6 x USB 2.0. 1 x MiniDin 6 Femelle (PS/2). 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 6 x Jack 3.5mm Femelle Stéréo. 2 x USB 3.0', 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/38/94/LD0003389477_1.jpg'),
(97, 'PC10 NEXTREME', NULL, 'AMD FX 8-Core', '8 Go', 'AMD Radeon R9 380', '1 To', '500 W', '849€95', 'PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/49/47/LD0001494732_1_0001560936_0001561076_0001561128_0001561164.jpg'),
(98, 'PC10 PAINTER', NULL, 'AMD FirePro APU', '4 Go', 'AMD FirePro A320', '500 Go', '400 W', '849€95', 'PC3-12800 - DDR3 1600 MHz', '3.8 GHz', NULL, NULL, NULL, 'Mini Tour', NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/02/99/87/LD0002998783_1.jpg'),
(99, '10DS0005FR', NULL, 'Intel Core i7', '8 Go', 'Intel HD Graphics 4600', NULL, '180 W', '849€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, NULL, '1 x Série (RS-232). 2 x USB 2.0. 1 x Port Parallèle. 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 3 x Jack 3.5mm Femelle Stéréo. 1 x DisplayPort. 2 x USB 3.0', 'Mini Tour', NULL, 'Microsoft Windows 8.1 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/01/49/80/LD0001498070_1_0001659082_0001671132_0001718329_0003001182_0003257942.jpg'),
(100, 'PC7 D-SIGN', NULL, 'Intel Core i5', '4 Go', 'NVIDIA Quadro K620', '1 To', '400 W', '839€95', 'PC3-10600 - DDR3 1333 MHz', '3 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Professionnel 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/43/79/LD0003437984_1.jpg'),
(101, 'ET2323INK-BC026Q', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 5500', NULL, '90 W', '829€95', 'PC3-12800 - DDR3 1600 MHz', '2.1 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'ASUS', NULL, 'http://media.ldlc.com/ld/products/00/03/39/84/LD0003398437_1.jpg'),
(102, 'PRO24 2M-008XEU', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', NULL, '120 W', '829€95', NULL, '2.9 GHz', NULL, NULL, NULL, NULL, NULL, 'Aucun', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/03/26/62/LD0003266219_1_0003266521_0003266734.jpg'),
(103, 'A6410-BC046T', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', NULL, '120 W', '823€95', 'PC3-12800 - DDR3 1600 MHz', '3 GHz', NULL, NULL, '1 x HDMI Femelle. 2 x USB 2.0. 1 x RJ45 Femelle. 2 x USB 3.0. 1 x HDMI Femelle (Entrée)', NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'ASUS', NULL, 'http://media.ldlc.com/ld/products/00/02/95/14/LD0002951406_1_0003223867.jpg'),
(104, 'F0B100HJFR', NULL, 'Intel Core i5', '4 Go', 'NVIDIA GeForce 820A', NULL, NULL, '819€95', NULL, '2.2 GHz', NULL, '1 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/03/34/61/LD0003346132_1.jpg'),
(105, 'T9S92ET#ABF', NULL, 'Intel Core i5', '8 Go', 'Intel HD Graphics 530', NULL, '180 W', '799€95', 'PC4-17000 - DDR4 2133 MHz', '3.2 GHz', NULL, NULL, NULL, 'Mini Tour', NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'HP', NULL, 'http://media.ldlc.com/ld/products/00/03/49/31/LD0003493111_1.jpg'),
(106, 'PC SAGA-B150-I5-8-H1', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', '350 W', '799€95', 'PC3-10600 - DDR3 1333 MHz', '2.7 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/44/11/LD0001441145_1_0003427587.jpg'),
(107, '10C20003FR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', NULL, '150 W', '799€95', 'PC3-12800 - DDR3 1600 MHz', '3.5 GHz', NULL, NULL, '0', NULL, NULL, 'Microsoft Windows 8 Pro 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/01/65/85/LD0001658543_1_0002409617.jpg'),
(108, '9S6-ACB111-055', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4600', '500 Go', '90 W', '799€95', 'PC3-12800 - DDR3 1600 MHz', '2.4 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/03/18/32/LD0003183273_1_0003276573.jpg'),
(109, 'VFY:P0420P771OFR', NULL, 'Intel Core i7', '4 Go', 'Intel HD Graphics 4600', '1 To', NULL, '789€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, NULL, 'Mini Tour', NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'Fujitsu', NULL, 'http://media.ldlc.com/ld/products/00/01/73/08/LD0001730828_1_0003385449.jpg'),
(110, 'K4S84EA#ABF', NULL, 'Intel Core i5', '6 Go', 'NVIDIA GeForce GTX 745', '3 To', '180 W', '779€95', NULL, '2.9 GHz', NULL, '4 Go', '1 x HDMI Femelle. 1 x DVI Femelle. 4 x USB 2.0. 1 x RJ45 Femelle. 5 x Jack 3.5mm Femelle Stéréo. 2 x USB 3.0. 1 x DisplayPort Femelle', 'Mini Tour', NULL, 'Microsoft Windows 8.1 64 bits', 'HP', NULL, 'http://media.ldlc.com/ld/products/00/02/83/36/LD0002833609_1_0003055601.jpg'),
(111, '10E2001NFR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', NULL, '65 W', '769€95', 'PC3-12800 - DDR3 1600 MHz', '1.7 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/02/87/05/LD0002870564_1.jpg'),
(112, 'HFR_GAMING_7', NULL, 'Intel Core i3', '4 Go', 'NVIDIA GeForce GTX 950', NULL, '400 W', '759€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/90/93/LD0002909317_1.jpg'),
(113, 'PC7 SKYMAX', NULL, 'Intel Core i3', '8 Go', 'NVIDIA GeForce GTX 950', '1 To', '500 W', '759€95', 'PC3-12800 - DDR3 1600 MHz', '3.7 GHz', NULL, '2 Go', NULL, 'Mini Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/36/66/LD0003366686_1_0003366711.jpg'),
(114, 'HFR_GAMING_10', NULL, 'Intel Core i3', '4 Go', 'NVIDIA GeForce GTX 950', NULL, '400 W', '749€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/90/93/LD0002909312_1.jpg'),
(115, 'HFR_GAMING_PLUS_MO', NULL, 'Intel Core i5', '8 Go', 'AMD Radeon R9 380', NULL, '500 W', '749€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/90/92/LD0002909287_1.jpg'),
(116, 'PC10 SKYMAX', NULL, 'Intel Core i3', '8 Go', 'NVIDIA GeForce GTX 950', '1 To', '500 W', '739€95', 'PC3-12800 - DDR3 1600 MHz', '3.7 GHz', NULL, '2 Go', NULL, 'Mini Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/37/71/LD0003377155_1.jpg'),
(117, 'PC FORTRESS', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GTX 960', '1 To', '350 W', '719€95', 'PC3-10600 - DDR3 1333 MHz', '2.7 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/44/11/LD0001441145_1.jpg'),
(118, 'M32CD-FR018T', NULL, 'Intel Core i5', '8 Go', 'NVIDIA GeForce GT 720', NULL, '300 W', '699€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, '2 Go', NULL, NULL, NULL, 'Microsoft Windows 10 Famille 64 bits', 'ASUS', NULL, 'http://media.ldlc.com/ld/products/00/03/48/90/LD0003489055_1.jpg'),
(119, 'HFR_GAMING_PLUS_KIT', NULL, 'Intel Core i5', '8 Go', 'AMD Radeon R9 380', NULL, '500 W', '699€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/90/92/LD0002909282_1.jpg'),
(120, 'HFR_GAMING_GPUFLEX_10', NULL, 'Intel Core i5', '8 Go', 'Intel HD Graphics 4600', NULL, '500 W', '679€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, NULL, 'Gaming', 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/90/92/LD0002909267_1.jpg'),
(121, 'LDLC PC BRIX-I5-4-S1H10-W7', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 5500', 'SSD 128 Go', NULL, '679€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, NULL, 'Mini PC', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/02/88/91/LD0002889189_1_0003345731_0003346630_0003347742_0003347754.jpg'),
(122, 'PC7 HAZMAX', 'MSI H81M-P33', 'Intel Core i3', '4 Go', 'NVIDIA GeForce GTX 950', '1 To', '500 W', '659€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, '2 Go', NULL, 'Mini Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/36/63/LD0003366346_1.jpg'),
(123, 'PC10 HAZMAX', 'MSI H81M-P33', 'Intel Core i3', '4 Go', 'NVIDIA GeForce GTX 950', '1 To', '500 W', '649€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, '2 Go', NULL, 'Mini Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/36/63/LD0003366341_1.jpg'),
(124, 'PRO24 2M-002XEU', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', NULL, '120 W', '649€95', NULL, '3.6 GHz', NULL, NULL, NULL, NULL, NULL, 'Aucun', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/03/26/62/LD0003266219_1.jpg'),
(125, 'A4320-BB020X', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', NULL, '120 W', '639€95', 'PC3-12800 - DDR3 1600 MHz', '3.7 GHz', NULL, NULL, '1 x Série (RS-232). 1 x HDMI Femelle. 2 x USB 2.0. 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 2 x USB 3.0', NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'ASUS', NULL, 'http://media.ldlc.com/ld/products/00/03/48/74/LD0003487412_1.jpg'),
(126, 'VFY:P0420P751OFR', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', '500 Go', NULL, '639€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, NULL, NULL, 'Mini Tour', NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'Fujitsu', NULL, 'http://media.ldlc.com/ld/products/00/01/73/08/LD0001730828_1_0003082056_0003082288_0003361674.jpg'),
(127, 'LDLC PC BRIX-I5-4-H10-W10', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 5500', '1 To', NULL, '635€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, 'Non', 'Mini PC', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/02/88/91/LD0002889189_1_0002889325_0003347461_0003347537_0003347553.jpg'),
(128, 'DT.VLUEF.018', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', NULL, '300 W', '629€95', 'PC3-12800 - DDR3 1600 MHz', '3.2 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'Acer', NULL, 'http://media.ldlc.com/ld/products/00/03/36/06/LD0003360643_1_0003360776.jpg'),
(129, 'A4310-BB021T', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', NULL, '90 W', '629€95', 'PC3-12800 - DDR3 1600 MHz', '1.9 GHz', NULL, NULL, '1 x Série (RS-232). 2 x USB 2.0. 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle', NULL, NULL, 'Microsoft Windows 8.1 Pro 64 bits', 'ASUS', NULL, 'http://media.ldlc.com/ld/products/00/02/84/18/LD0002841826_1_0003078641_0003078756.jpg'),
(130, 'HFR_GAMING_MO', NULL, 'Intel Core i3', '4 Go', 'NVIDIA GeForce GTX 950', NULL, '400 W', '629€95', 'PC3-10600 - DDR3 1333 MHz', '3.6 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'HardWare.fr', NULL, 'http://media.ldlc.com/ld/products/00/02/90/93/LD0002909307_1.jpg'),
(131, 'N9E72ET#ABF', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', '500 Go', '180 W', '629€95', 'PC3-12800 - DDR3 1600 MHz', '3 GHz', NULL, NULL, '1 x Série (RS-232). 6 x USB 2.0. 2 x MiniDin 6 Femelle (PS/2). 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 2 x Jack 3.5mm Femelle Stéréo. 1 x DisplayPort Femelle', 'Mini Tour', NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'HP', NULL, 'http://media.ldlc.com/ld/products/00/01/69/23/LD0001692318_1_0003294024.jpg'),
(132, 'D-SIGN', NULL, 'Intel Core i5', '4 Go', 'NVIDIA Quadro K620', '1 To', '400 W', '629€95', 'PC3-10600 - DDR3 1333 MHz', '3 GHz', NULL, '2 Go', 'Moyen Tour', 'Moyen Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/43/80/LD0003438014_1.jpg'),
(133, '10HS0033FR', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', NULL, '180 W', '629€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/03/48/98/LD0003489854_1.jpg'),
(134, 'AE200 5M-216EU', NULL, 'AMD E2 Quad-Core APU', '4 Go', 'AMD Radeon R2', NULL, '65 W', '629€95', NULL, '1.5 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/01/71/42/LD0001714287_1_0003163276.jpg'),
(135, 'ZBOX-MA760-P-BE', NULL, 'AMD FX Quad-Core', NULL, 'AMD Radeon R7', NULL, NULL, '627€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, '0', NULL, NULL, NULL, 'ZOTAC', NULL, 'http://media.ldlc.com/ld/products/00/03/11/07/LD0003110791_1_0003110821.jpg'),
(136, 'LDLC PC BRIX-I5-4-S1-W7', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 5500', 'SSD 128 Go', NULL, '619€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, 'Non', 'Mini PC', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/02/89/69/LD0002896902_1_0003347572_0003347633.jpg'),
(137, 'PC7 VEGA', NULL, 'AMD A10 Quad-Core APU', '4 Go', 'AMD Radeon R7', 'SSD 120 Go', '350 W', '619€95', 'PC3-12800 - DDR3 1600 MHz', '3.9 GHz', NULL, NULL, NULL, 'Mini Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/48/66/LD0003486633_1.jpg'),
(138, 'LDLC PC BRIX-I5-4-S1-W10', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 5500', 'SSD 128 Go', NULL, '609€95', 'PC3-12800 - DDR3 1600 MHz', '2.7 GHz', NULL, NULL, 'Non', 'Mini PC', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/02/89/69/LD0002896902_1_0003347572_0003347633_0003347709.jpg'),
(139, 'PC10 VEGA', NULL, 'AMD A10 Quad-Core APU', '4 Go', 'AMD Radeon R7', '120 Go', '350 W', '609€95', 'PC3-12800 - DDR3 1600 MHz', '3.9 GHz', NULL, NULL, NULL, 'Mini Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/48/66/LD0003486643_1.jpg'),
(140, '10DS000HFR', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', '500 Go', '180 W', '609€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, NULL, NULL, 'Mini Tour', NULL, 'Microsoft Windows 8.1 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/01/49/80/LD0001498070_1_0001659082_0001671132_0001718329_0002419124_0003228001_0003230092.jpg'),
(141, 'X5040TA BLACK', NULL, 'Intel Celeron', '4 Go', 'Intel HD Graphics', '500 Go', '65 W', '608€95', 'PC3-12800 - DDR3 1600 MHz', '1.4 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'Shuttle', NULL, 'http://media.ldlc.com/ld/products/00/02/91/76/LD0002917619_1_0002918249_0002918534.jpg'),
(142, 'L6K50EA#ABF', NULL, 'AMD A4 Quad-Core APU', '4 Go', 'AMD Radeon R3', NULL, '65 W', '599€95', NULL, '1.8 GHz', NULL, NULL, 'Filaire', NULL, NULL, 'Microsoft Windows 8.1 64 bits', 'HP', NULL, 'http://media.ldlc.com/ld/products/00/02/83/85/LD0002838557_1_0003056355.jpg'),
(143, 'M3X13ET#ABF', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4400', '500 Go', '180 W', '599€95', 'PC3-12800 - DDR3 1600 MHz', '3.7 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10', 'HP', NULL, 'http://media.ldlc.com/ld/products/00/03/21/62/LD0003216204_1.jpg'),
(144, 'M3X16ET#ABF', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', '500 Go', '180 W', '599€95', 'PC3-12800 - DDR3 1600 MHz', '3.7 GHz', NULL, NULL, '1 x Série (RS-232). Line IN (Jack 3.5 mm Femelle). Line OUT (Jack 3.5mm Femelle). 6 x USB 2.0. 1 x VGA (D-sub 15 Femelle). 1 x RJ45 Femelle. 2 x PS/2. 1 x DisplayPort Femelle', NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'HP', NULL, 'http://media.ldlc.com/ld/products/00/03/20/18/LD0003201867_1.jpg'),
(145, 'PC SKYMAX', NULL, 'Intel Core i3', '8 Go', 'NVIDIA GeForce GTX 950', '1 To', '500 W', '599€95', 'PC3-12800 - DDR3 1600 MHz', '3.7 GHz', NULL, '2 Go', NULL, 'Mini Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/37/71/LD0003377145_1.jpg'),
(146, 'PC10 ABADDON', NULL, 'AMD A10 Quad-Core APU', '8 Go', 'AMD Radeon R7', '1 To', '500 W', '599€95', 'PC3-17066 - DDR3 2133 MHz', '3.5 GHz', NULL, NULL, NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Famille 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/41/54/LD0003415452_1.jpg'),
(147, '10DU0005FR', NULL, 'Intel Core i5', '4 Go', 'Intel HD Graphics 4600', '500 Go', '180 W', '599€95', 'PC3-12800 - DDR3 1600 MHz', '2.9 GHz', NULL, NULL, NULL, 'Mini Tour', NULL, 'Microsoft Windows 8.1 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/01/47/99/LD0001479992_1_0001492345_0001505672_0001620416_0001723590_0003226865.jpg'),
(148, '10AY003WFR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', '500 Go', '65 W', '599€95', 'PC3-12800 - DDR3 1600 MHz', '3 GHz', NULL, NULL, 'Filaire', NULL, NULL, 'Microsoft Windows 8 Pro 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/01/45/86/LD0001458614_1_0001595653_0002419139_0002984208.jpg');
INSERT INTO `computer` (`id`, `name`, `motherBoard`, `CPU`, `RAM`, `GPU`, `ROM`, `powerSupply`, `price`, `RAM_freq`, `CPU_freq`, `GPU_freq`, `GPU_RAM`, `E_S`, `case_pc`, `airing`, `OS`, `brand`, `soundCard`, `pict`) VALUES
(149, 'PC10 CENTAURE', NULL, 'AMD A8 Quad-Core APU', '4 Go', 'AMD Radeon R7', 'SSD 64 Go', '350 W', '589€95', 'PC3-10600 - DDR3 1333 MHz', '3.3 GHz', NULL, NULL, NULL, 'Moyen Tour', NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/02/63/LD0003026344_1.jpg'),
(150, 'PC7 NEWFIGHTER', NULL, 'AMD A8 Quad-Core APU', '4 Go', 'AMD Radeon R7', 'SSD 60 Go', '350 W', '589€95', 'PC3-12800 - DDR3 1600 MHz', '3.3 GHz', NULL, NULL, NULL, 'Moyen Tour', NULL, 'Microsoft Windows 7 Édition Familiale Premium 64 bits', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/03/41/54/LD0003415432_1.jpg'),
(151, 'AP200-200XEU', NULL, 'Intel Pentium', '4 Go', 'Intel HD Graphics', NULL, '120 W', '569€95', NULL, '3.2 GHz', NULL, NULL, NULL, NULL, NULL, 'Aucun', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/03/00/38/LD0003003811_1.jpg'),
(152, 'AP200-208XEU', NULL, 'Intel Pentium', '4 Go', 'Intel HD Graphics', NULL, '120 W', '569€95', NULL, '3.2 GHz', NULL, NULL, NULL, NULL, NULL, 'Aucun', 'MSI', NULL, 'http://media.ldlc.com/ld/products/00/02/83/75/LD0002837590_1.jpg'),
(153, 'T4R58ET#ABF', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 530', '500 Go', '65 W', '549€95', 'PC4-17000 - DDR4 2133 MHz', '3.2 GHz', NULL, NULL, NULL, NULL, NULL, 'Microsoft Windows 10 Professionnel 64 bits', 'HP', NULL, 'http://media.ldlc.com/ld/products/00/03/44/83/LD0003448300_1.jpg'),
(154, 'PC ORIGIN', NULL, 'AMD FX Quad-Core', '4 Go', 'AMD Radeon R7 370', '1 To', '500 W', '549€95', 'PC3-12800 - DDR3 1600 MHz', '3.8 GHz', NULL, '2 Go', NULL, 'Moyen Tour', NULL, 'Aucun', 'LDLC', NULL, 'http://media.ldlc.com/ld/products/00/01/49/47/LD0001494732_1_0001560936.jpg'),
(155, '10DU0003FR', NULL, 'Intel Core i3', '4 Go', 'Intel HD Graphics 4400', '500 Go', '180 W', '549€95', 'PC3-12800 - DDR3 1600 MHz', '3.6 GHz', NULL, NULL, NULL, 'Mini Tour', NULL, 'Microsoft Windows 8.1 64 bits', 'Lenovo', NULL, 'http://media.ldlc.com/ld/products/00/01/47/99/LD0001479992_1_0001492345_0001505672_0001620416_0001723590_0003226865_0003230553.jpg');

-- --------------------------------------------------------

--
-- Structure de la table `reserve`
--

CREATE TABLE `reserve` (
  `id_user` int(10) unsigned DEFAULT NULL,
  `id_computer` int(10) unsigned DEFAULT NULL,
  `name_computer` varchar(255) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `price_computer` varchar(255) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Contenu de la table `reserve`
--

INSERT INTO `reserve` (`id_user`, `id_computer`, `name_computer`, `date`, `price_computer`) VALUES
(243, 6, 'PC7 PHANTOM', '2016-02-02 08:01:50', '3 189€95'),
(243, 3, 'PC7 MAX4K', '2016-02-02 15:05:27', '3 249€95');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
`id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `salt` int(11) NOT NULL
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id`, `username`, `role`, `password`, `salt`) VALUES
(1, 'kalash', 'admin', 'a8a6d3dcba1983ee199a03efff8518e954fdce9876a830523e9ee3ee471a70d8', 12),
(2, 'alainsamuel', 'user', 'grenade', 43);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `computer`
--
ALTER TABLE `computer`
 ADD PRIMARY KEY (`id`);

--
-- Index pour la table `reserve`
--
ALTER TABLE `reserve`
 ADD UNIQUE KEY `id_user` (`id_user`,`id_computer`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`id`), ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `computer`
--
ALTER TABLE `computer`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=156;
--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;