-- phpMyAdmin SQL Dump
-- version 4.2.5
-- http://www.phpmyadmin.net
--
-- Client :  localhost:8889
-- Généré le :  Jeu 07 Janvier 2016 à 11:55
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
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

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
MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;