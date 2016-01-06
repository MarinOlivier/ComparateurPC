-- phpMyAdmin SQL Dump
-- version 4.4.13.1
-- http://www.phpmyadmin.net
--
-- Client :  oliviermisbdd.mysql.db
-- Généré le :  Mer 06 Janvier 2016 à 15:08
-- Version du serveur :  5.5.46-0+deb7u1-log
-- Version de PHP :  5.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `oliviermisbdd`
--

-- --------------------------------------------------------

--
-- Structure de la table `computer`
--

CREATE TABLE IF NOT EXISTS `computer` (
  `id` int(11) NOT NULL,
  `motherBoard` varchar(255) DEFAULT NULL,
  `CPU` varchar(255) DEFAULT NULL,
  `RAM` int(11) DEFAULT NULL,
  `GPU` varchar(255) DEFAULT NULL,
  `ROM` int(11) DEFAULT NULL,
  `powerSupply` int(11) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `RAM_freq` float DEFAULT NULL,
  `CPU_freq` float DEFAULT NULL,
  `GPU_freq` float DEFAULT NULL,
  `GPU_RAM` int(11) DEFAULT NULL,
  `E_S` int(11) DEFAULT NULL,
  `case_pc` varchar(255) DEFAULT NULL,
  `airing` varchar(255) DEFAULT NULL,
  `OS` varchar(255) DEFAULT NULL,
  `brand` varchar(255) DEFAULT NULL,
  `soundCard` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `reserve`
--

CREATE TABLE IF NOT EXISTS `reserve` (
  `id_user` int(11) NOT NULL,
  `id_computeur` int(11) NOT NULL,
  `date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00' ON UPDATE CURRENT_TIMESTAMP
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
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
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `computer`
--
ALTER TABLE `computer`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
