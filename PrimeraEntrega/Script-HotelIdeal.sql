-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-10-2023 a las 23:58:37
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotelideal`
--
CREATE DATABASE IF NOT EXISTS `hotelideal` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `hotelideal`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `piso` int(1) NOT NULL,
  `precio` int(11) NOT NULL,
  `tipoHabitacion` enum('ESTANDAR_SIMPLE','ESTANDAR_SIMPLE_QUEEN','ESTANDAR_DOBLE_TWIN','ESTANDAR_DOBLE_MAT','ESTANDAR_TRIPLE_TWIN','ESTANDAR_TRIPLE_MAT','SUITE_DE_LUJO') NOT NULL,
  `ocupada` tinyint(1) NOT NULL,
  `habilitada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `piso`, `precio`, `tipoHabitacion`, `ocupada`, `habilitada`) VALUES
(1, 1, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(2, 1, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(3, 1, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(4, 1, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(5, 1, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(6, 1, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(7, 1, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(8, 1, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(9, 1, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(10, 1, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(11, 1, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(12, 1, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(13, 1, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(14, 1, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(15, 1, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(16, 1, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(17, 1, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(18, 1, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(19, 1, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(20, 1, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(21, 1, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(22, 1, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(23, 1, 5000, 'SUITE_DE_LUJO', 0, 1),
(24, 1, 5000, 'SUITE_DE_LUJO', 0, 1),
(25, 1, 5000, 'SUITE_DE_LUJO', 0, 1),
(26, 2, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(27, 2, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(28, 2, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(29, 2, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(30, 2, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(31, 2, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(32, 2, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(33, 2, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(34, 2, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(35, 2, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(36, 2, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(37, 2, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(38, 2, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(39, 2, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(40, 2, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(41, 2, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(42, 2, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(43, 2, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(44, 2, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(45, 2, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(46, 2, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(47, 2, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(48, 2, 5000, 'SUITE_DE_LUJO', 0, 1),
(49, 2, 5000, 'SUITE_DE_LUJO', 0, 1),
(50, 2, 5000, 'SUITE_DE_LUJO', 0, 1),
(51, 3, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(52, 3, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(53, 3, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(54, 3, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(55, 3, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(56, 3, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(57, 3, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(58, 3, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(59, 3, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(60, 3, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(61, 3, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(62, 3, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(63, 3, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(64, 3, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(65, 3, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(66, 3, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(67, 3, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(68, 3, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(69, 3, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(70, 3, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(71, 3, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(72, 3, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(73, 3, 5000, 'SUITE_DE_LUJO', 0, 1),
(74, 3, 5000, 'SUITE_DE_LUJO', 0, 1),
(75, 3, 5000, 'SUITE_DE_LUJO', 0, 1),
(76, 4, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(77, 4, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(78, 4, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(79, 4, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(80, 4, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(81, 4, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(82, 4, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(83, 4, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(84, 4, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(85, 4, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(86, 4, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(87, 4, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(88, 4, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(89, 4, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(90, 4, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(91, 4, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(92, 4, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(93, 4, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(94, 4, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(95, 4, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(96, 4, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(97, 4, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(98, 4, 5000, 'SUITE_DE_LUJO', 0, 1),
(99, 4, 5000, 'SUITE_DE_LUJO', 0, 1),
(100, 4, 5000, 'SUITE_DE_LUJO', 0, 1),
(101, 5, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(102, 5, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(103, 5, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(104, 5, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(105, 5, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(106, 5, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(107, 5, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(108, 5, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(109, 5, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(110, 5, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(111, 5, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(112, 5, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(113, 5, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(114, 5, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(115, 5, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(116, 5, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(117, 5, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(118, 5, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(119, 5, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(120, 5, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(121, 5, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(122, 5, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(123, 5, 5000, 'SUITE_DE_LUJO', 0, 1),
(124, 5, 5000, 'SUITE_DE_LUJO', 0, 1),
(125, 5, 5000, 'SUITE_DE_LUJO', 0, 1),
(126, 6, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(127, 6, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(128, 6, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(129, 6, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(130, 6, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(131, 6, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(132, 6, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(133, 6, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(134, 6, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(135, 6, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(136, 6, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(137, 6, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(138, 6, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(139, 6, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(140, 6, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(141, 6, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(142, 6, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(143, 6, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(144, 6, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(145, 6, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(146, 6, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(147, 6, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(148, 6, 5000, 'SUITE_DE_LUJO', 0, 1),
(149, 6, 5000, 'SUITE_DE_LUJO', 0, 1),
(150, 6, 5000, 'SUITE_DE_LUJO', 0, 1),
(151, 7, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(152, 7, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(153, 7, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(154, 7, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(155, 7, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(156, 7, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(157, 7, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(158, 7, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(159, 7, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(160, 7, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(161, 7, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(162, 7, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(163, 7, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(164, 7, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(165, 7, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(166, 7, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(167, 7, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(168, 7, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(169, 7, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(170, 7, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(171, 7, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(172, 7, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(173, 7, 5000, 'SUITE_DE_LUJO', 0, 1),
(174, 7, 5000, 'SUITE_DE_LUJO', 0, 1),
(175, 7, 5000, 'SUITE_DE_LUJO', 0, 1),
(176, 8, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(177, 8, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(178, 8, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(179, 8, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(180, 8, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(181, 8, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(182, 8, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(183, 8, 1500, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(184, 8, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(185, 8, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(186, 8, 2000, 'ESTANDAR_DOBLE_TWIN', 0, 1),
(187, 8, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(188, 8, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(189, 8, 2000, 'ESTANDAR_DOBLE_MAT', 0, 1),
(190, 8, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(191, 8, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(192, 8, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(193, 8, 2000, 'ESTANDAR_TRIPLE_MAT', 0, 1),
(194, 8, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(195, 8, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(196, 8, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(197, 8, 3000, 'ESTANDAR_TRIPLE_TWIN', 0, 1),
(198, 8, 5000, 'SUITE_DE_LUJO', 0, 1),
(199, 8, 5000, 'SUITE_DE_LUJO', 0, 1),
(200, 8, 5000, 'SUITE_DE_LUJO', 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `huesped`
--

CREATE TABLE `huesped` (
  `idHuesped` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `dni` int(8) NOT NULL,
  `domicilio` varchar(100) NOT NULL,
  `correo` varchar(60) NOT NULL,
  `celular` bigint(20) NOT NULL,
  `alojado` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `huesped`
--

INSERT INTO `huesped` (`idHuesped`, `nombre`, `dni`, `domicilio`, `correo`, `celular`, `alojado`) VALUES
(1, 'Joel', 36774181, 'Sargento Cabral 1450', 'joelbrondo@gmail.com', 351718647, 0),
(2, 'Joel', 36774181, 'Sargento Cabral 1450', 'joelbrondo@gmail.com', 351718647, 0),
(3, 'Joel', 36774181, 'Sargento Cabral 1450', 'joelbrondo@gmail.com', 351718647, 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reserva`
--

CREATE TABLE `reserva` (
  `idReserva` int(11) NOT NULL,
  `idHuesped` int(11) NOT NULL,
  `idHabitacion` int(11) NOT NULL,
  `cantPax` int(1) NOT NULL,
  `fechaInn` date NOT NULL,
  `fechaOut` date NOT NULL,
  `importe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  ADD PRIMARY KEY (`idHabitacion`);

--
-- Indices de la tabla `huesped`
--
ALTER TABLE `huesped`
  ADD PRIMARY KEY (`idHuesped`);

--
-- Indices de la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD PRIMARY KEY (`idReserva`),
  ADD KEY `idHabitacion` (`idHabitacion`),
  ADD KEY `idHuesped` (`idHuesped`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `habitacion`
--
ALTER TABLE `habitacion`
  MODIFY `idHabitacion` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=201;

--
-- AUTO_INCREMENT de la tabla `huesped`
--
ALTER TABLE `huesped`
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `reserva`
--
ALTER TABLE `reserva`
  ADD CONSTRAINT `reserva_ibfk_2` FOREIGN KEY (`idHuesped`) REFERENCES `huesped` (`idHuesped`),
  ADD CONSTRAINT `reserva_ibfk_3` FOREIGN KEY (`idHabitacion`) REFERENCES `habitacion` (`idHabitacion`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
