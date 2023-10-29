-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-10-2023 a las 17:33:19
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

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitacion`
--

CREATE TABLE `habitacion` (
  `idHabitacion` int(11) NOT NULL,
  `piso` int(1) NOT NULL,
  `precio` int(11) NOT NULL,
  `tipoHabitacion` enum('ESTANDAR_SIMPLE','ESTANDAR_SIMPLE_QUEEN','ESTANDAR_DOBLE_TWIN','ESTANDAR_DOBLE_MAT','ESTANDAR_TRIPLE_TWIN','ESTANDAR_TRIPLE_MAT','SUITE_DE_LUJO','SIN_TIPO') NOT NULL,
  `ocupada` tinyint(1) NOT NULL,
  `habilitada` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `habitacion`
--

INSERT INTO `habitacion` (`idHabitacion`, `piso`, `precio`, `tipoHabitacion`, `ocupada`, `habilitada`) VALUES
(1, 2, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(2, 1, 1000, 'ESTANDAR_SIMPLE', 0, 1),
(3, 2, 1000, 'ESTANDAR_SIMPLE_QUEEN', 0, 1),
(4, 2, 1000, 'ESTANDAR_SIMPLE', 0, 1),
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
(16, 1, 2000, 'ESTANDAR_SIMPLE', 0, 1),
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
(6, 'Juan Pérez', 21547896, 'Avenida 9 de Julio 1234', 'juanperez@gmail.com', 1547896321, 0),
(7, 'María López', 31256987, 'Calle Florida 5678', 'marialopez@gmail.com', 1165423987, 0),
(8, 'Carlos González', 40251374, 'Avenida Corrientes 987', 'carlosgonzalez@gmail.com', 1154789632, 0),
(9, 'Laura Rodríguez', 30521489, 'Calle Lavalle 54321', 'laurarodriguez@gmail.com', 1132457896, 0),
(10, 'Pedro Fernández', 29876541, 'Avenida Santa Fe 876', 'pedrofernandez@gmail.com', 1165423875, 0),
(11, 'Ana Martínez', 41652378, 'Calle Sarmiento 2345', 'anamartinez@gmail.com', 1178945623, 0),
(12, 'Luis Sánchez', 35247896, 'Avenida Belgrano 67890', 'luissanchez@gmail.com', 1123456789, 0),
(13, 'Sofía Ramírez', 27654189, 'Calle Reconquista 123', 'sofiaramirez@gmail.com', 1132147896, 0),
(14, 'Javier Torres', 41589237, 'Avenida Rivadavia 9876', 'javiertorres@gmail.com', 1147852369, 0),
(15, 'Elena Díaz', 33014598, 'Calle San Martín 4567', 'elenadiaz@gmail.com', 1178956342, 0),
(16, 'Diego Mendoza', 28543201, 'Avenida Córdoba 1234', 'diegomendoza@gmail.com', 1123654789, 0),
(17, 'Marta Paredes', 39126547, 'Calle Callao 7890', 'martaparedes@gmail.com', 1157842369, 0),
(18, 'Ricardo Vargas', 31478965, 'Avenida Pueyrredón 456', 'ricardovargas@gmail.com', 1165423987, 0),
(19, 'Carmen Gómez', 42154896, 'Calle Paraguay 12345', 'carmengomez@gmail.com', 1178956342, 0),
(20, 'Fernando Silva', 33652147, 'Avenida Scalabrini Ortiz 789', 'fernandosilva@gmail.com', 1132147896, 0),
(21, 'Sara Ortega', 41236598, 'Calle Esmeralda 2345', 'saraortega@gmail.com', 1123654789, 0),
(22, 'Andrés Cruz', 29654713, 'Avenida Juan B. Justo 678', 'andrescruz@gmail.com', 1165423987, 0),
(23, 'Lorena Guzmán', 40123765, 'Calle Defensa 123', 'lorenaguzman@gmail.com', 1132457896, 0),
(24, 'Hugo Ríos', 34218756, 'Avenida Figueroa Alcorta 4567', 'hugorios@gmail.com', 1154789632, 0),
(25, 'Isabel Castro', 31564287, 'Calle Alsina 7890', 'isabelcastro@gmail.com', 1178945623, 0),
(26, 'Miguel Soto', 41236587, 'Avenida Del Libertador 2345', 'miguelsoto@gmail.com', 1123456789, 0),
(27, 'Patricia Herrera', 30897415, 'Calle Pellegrini 1234', 'patriciaherrera@gmail.com', 1178956342, 0),
(28, 'Rafael Montes', 40098536, 'Avenida Las Heras 7890', 'rafaelmontes@gmail.com', 1132147896, 0),
(29, 'Gloria Páez', 29978456, 'Calle Libertad 234', 'gloriapaez@gmail.com', 1147852369, 0),
(30, 'Antonio Navarro', 41789562, 'Avenida Dorrego 567', 'antonionavarro@gmail.com', 1123654789, 0),
(31, 'Cecilia Muñoz', 33421578, 'Calle Maipú 12345', 'ceciliamunoz@gmail.com', 1165423987, 0),
(32, 'José Méndez', 42015673, 'Avenida San Juan 67890', 'josemendez@gmail.com', 1157842369, 0),
(33, 'Daniela Roldán', 31148762, 'Calle Arenales 456', 'danielaroldan@gmail.com', 1132147896, 0),
(34, 'Raul Torres', 32415698, 'Avenida Hipólito Yrigoyen 1234', 'raultorres@gmail.com', 1123654789, 0),
(35, 'Carolina García', 39874561, 'Calle Mendoza 567', 'carolinagarcia@gmail.com', 1178945623, 0),
(36, 'Martín Fernández', 40781236, 'Avenida 25 de Mayo 2345', 'martinfernandez@gmail.com', 1165423875, 0),
(37, 'Silvina López', 32247819, 'Calle Rosario 123', 'silvinalopez@gmail.com', 1154789632, 0),
(38, 'Joaquín Romero', 39562184, 'Avenida 18 de Julio 678', 'joaquinromero@gmail.com', 1132457896, 0),
(39, 'Victoria Sánchez', 41789632, 'Calle Santiago del Estero 9876', 'victoriasanchez@gmail.com', 1123456789, 0),
(40, 'Lucas Pérez', 30781256, 'Avenida San Lorenzo 4567', 'lucasperez@gmail.com', 1165423875, 0),
(41, 'Ana Belén Rodríguez', 41256984, 'Calle Catamarca 123', 'anabelenrodriguez@gmail.com', 1147852369, 0),
(42, 'Hernán Morales', 30874562, 'Avenida Colón 987', 'hernanmorales@gmail.com', 1178945623, 0),
(43, 'Valentina Méndez', 40158736, 'Calle La Rioja 2345', 'valentinamendez@gmail.com', 1157842369, 0),
(44, 'Pablo Gómez', 32984561, 'Avenida San Martín 1234', 'pablogomez@gmail.com', 1165423875, 0),
(45, 'Dolores Fernández', 40098561, 'Calle Balcarce 567', 'doloresfernandez@gmail.com', 1123654789, 0),
(46, 'Marcos Silva', 33546198, 'Avenida 20 de Febrero 7890', 'marcossilva@gmail.com', 1132147896, 0),
(47, 'Agustina Ríos', 41256973, 'Calle Santa Cruz 234', 'agustinarios@gmail.com', 1147852369, 0),
(48, 'Maximiliano Castro', 32147598, 'Avenida Vélez Sársfield 12345', 'maximilianocastro@gmail.com', 1157842369, 0),
(49, 'Renata Paredes', 41785632, 'Calle San Luis 4567', 'renataparedes@gmail.com', 1165423987, 0),
(50, 'Felipe Vargas', 30984567, 'Avenida Colón 123', 'felipevargas@gmail.com', 1178945623, 0),
(51, 'Luisa González', 33879562, 'Calle Entre Ríos 7890', 'luisagonzalez@gmail.com', 1165478943, 0),
(52, 'Roberto Martínez', 42563201, 'Avenida Leandro N. Alem 234', 'robertomartinez@gmail.com', 1147896321, 0),
(53, 'Mariana Silva', 31654298, 'Calle Tucumán 12345', 'marianasilva@gmail.com', 1123654879, 0),
(54, 'Eduardo Pérez', 40236587, 'Avenida Cerrito 456', 'eduardoperez@gmail.com', 1178945621, 0),
(55, 'Cecilia Soto', 33451269, 'Calle Chacabuco 1234', 'ceciliasoto@gmail.com', 1132457892, 0),
(56, 'Gustavo Torres', 41978563, 'Avenida 9 de Julio 987', 'gustavotorres@gmail.com', 1157842362, 0),
(57, 'Adriana García', 32236985, 'Calle Buenos Aires 567', 'adrianagarcia@gmail.com', 1165423981, 0),
(58, 'Manuel López', 39871245, 'Avenida Scalabrini Ortiz 2345', 'manuellopez@gmail.com', 1123654781, 0),
(59, 'Valeria Ramírez', 41325698, 'Calle Riobamba 123', 'valeriaramirez@gmail.com', 1178956341, 0),
(60, 'Jorge Fernández', 29784562, 'Avenida Independencia 4567', 'jorgefernandez@gmail.com', 1132147891, 0);

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
-- Volcado de datos para la tabla `reserva`
--

INSERT INTO `reserva` (`idReserva`, `idHuesped`, `idHabitacion`, `cantPax`, `fechaInn`, `fechaOut`, `importe`) VALUES
(359, 6, 1, 1, '2023-11-01', '2023-11-05', 4000),
(360, 7, 2, 2, '2023-11-01', '2023-11-06', 5000),
(361, 8, 3, 3, '2023-11-02', '2023-11-10', 8000),
(362, 9, 4, 4, '2023-11-01', '2023-11-08', 7000),
(363, 10, 5, 1, '2023-11-03', '2023-11-07', 4000),
(364, 11, 6, 2, '2023-11-01', '2023-11-06', 7500),
(365, 12, 7, 3, '2023-11-05', '2023-11-10', 7500),
(366, 13, 8, 4, '2023-11-01', '2023-11-08', 10500),
(367, 14, 9, 1, '2023-11-04', '2023-11-07', 6000),
(368, 15, 10, 2, '2023-11-02', '2023-11-06', 8000),
(369, 16, 11, 3, '2023-11-01', '2023-11-10', 18000),
(370, 17, 12, 4, '2023-11-01', '2023-11-08', 14000),
(371, 18, 13, 1, '2023-11-05', '2023-11-07', 4000),
(372, 19, 14, 2, '2023-11-02', '2023-11-06', 8000),
(373, 20, 15, 3, '2023-11-01', '2023-11-10', 18000),
(374, 21, 16, 4, '2023-11-01', '2023-11-08', 14000),
(375, 22, 17, 1, '2023-11-01', '2023-11-09', 16000),
(376, 23, 18, 2, '2023-11-02', '2023-11-06', 8000),
(377, 24, 19, 3, '2023-11-01', '2023-11-10', 27000),
(378, 25, 20, 4, '2023-11-03', '2023-11-08', 15000),
(379, 26, 21, 1, '2023-11-01', '2023-11-07', 18000),
(380, 27, 22, 2, '2023-11-09', '2023-11-17', 24000),
(381, 28, 23, 3, '2023-11-06', '2023-11-11', 25000),
(382, 29, 24, 4, '2023-11-06', '2023-11-08', 10000),
(383, 30, 25, 1, '2023-11-02', '2023-11-13', 55000),
(384, 31, 26, 2, '2023-11-01', '2023-11-10', 9000),
(385, 32, 27, 3, '2023-11-08', '2023-11-10', 2000),
(386, 33, 28, 4, '2023-11-04', '2023-11-08', 4000),
(387, 34, 29, 1, '2023-11-01', '2023-11-15', 14000),
(388, 35, 30, 2, '2023-11-02', '2023-11-06', 4000),
(389, 36, 31, 3, '2023-11-04', '2023-11-10', 9000),
(390, 37, 32, 4, '2023-11-01', '2023-11-08', 10500),
(391, 38, 33, 1, '2023-11-05', '2023-11-10', 7500),
(392, 39, 34, 2, '2023-11-01', '2023-11-06', 10000),
(393, 40, 35, 3, '2023-11-01', '2023-11-10', 18000),
(394, 41, 36, 4, '2023-11-13', '2023-11-21', 16000),
(395, 42, 37, 1, '2023-11-06', '2023-11-07', 2000),
(396, 43, 38, 2, '2023-11-07', '2023-11-11', 8000),
(397, 44, 39, 3, '2023-11-01', '2023-11-10', 18000),
(398, 45, 40, 4, '2023-11-01', '2023-11-06', 10000),
(399, 46, 41, 1, '2023-11-01', '2023-11-09', 16000),
(400, 47, 42, 2, '2023-11-01', '2023-11-06', 10000),
(401, 48, 43, 3, '2023-11-01', '2023-11-10', 18000),
(402, 49, 44, 4, '2023-11-01', '2023-11-08', 21000),
(403, 50, 45, 1, '2023-11-01', '2023-11-07', 18000),
(404, 51, 46, 1, '2023-11-02', '2023-11-16', 42000),
(405, 51, 47, 1, '2023-11-06', '2023-11-12', 18000),
(406, 51, 48, 1, '2023-11-02', '2023-11-07', 25000),
(407, 51, 49, 1, '2023-11-02', '2023-11-06', 20000),
(408, 51, 50, 1, '2023-11-02', '2023-11-12', 50000),
(409, 51, 51, 1, '2023-11-05', '2023-11-12', 7000),
(410, 51, 52, 1, '2023-11-06', '2023-11-12', 6000),
(411, 51, 53, 1, '2023-11-10', '2023-11-18', 8000),
(412, 51, 54, 1, '2023-11-02', '2023-11-08', 6000),
(413, 51, 55, 1, '2023-11-04', '2023-11-14', 10000),
(414, 51, 56, 1, '2023-11-07', '2023-11-13', 9000),
(415, 51, 57, 1, '2023-11-02', '2023-11-19', 25500),
(416, 51, 58, 1, '2023-11-04', '2023-11-11', 10500),
(417, 51, 59, 1, '2023-11-02', '2023-11-13', 22000),
(418, 51, 60, 1, '2023-11-09', '2023-11-14', 10000),
(419, 51, 61, 1, '2023-11-10', '2023-11-12', 4000),
(420, 51, 62, 1, '2023-11-04', '2023-11-10', 12000),
(421, 51, 63, 1, '2023-11-06', '2023-11-18', 24000),
(422, 51, 64, 1, '2023-11-08', '2023-11-18', 20000),
(423, 51, 65, 1, '2023-11-04', '2023-11-17', 26000),
(424, 51, 66, 1, '2023-11-02', '2023-11-12', 20000),
(425, 51, 67, 1, '2023-11-04', '2023-11-10', 12000),
(426, 51, 68, 1, '2023-11-06', '2023-11-10', 8000),
(427, 51, 69, 1, '2023-11-08', '2023-11-11', 9000),
(428, 51, 70, 1, '2023-11-03', '2023-11-17', 42000),
(429, 51, 71, 1, '2023-11-06', '2023-11-10', 12000),
(430, 51, 72, 1, '2023-11-10', '2023-11-13', 9000),
(431, 51, 73, 1, '2023-11-02', '2023-11-17', 75000),
(432, 51, 74, 1, '2023-11-08', '2023-11-13', 25000),
(433, 51, 75, 1, '2023-11-04', '2023-11-08', 20000),
(434, 51, 76, 1, '2023-11-04', '2023-11-14', 10000),
(435, 51, 77, 1, '2023-11-03', '2023-11-12', 9000),
(436, 51, 78, 1, '2023-11-02', '2023-11-12', 10000),
(437, 51, 79, 1, '2023-11-02', '2023-11-09', 7000),
(438, 51, 80, 1, '2023-11-05', '2023-11-17', 12000),
(439, 51, 81, 1, '2023-11-17', '2023-12-02', 22500),
(440, 51, 82, 1, '2023-11-11', '2023-11-21', 15000),
(441, 51, 83, 1, '2023-11-05', '2023-11-17', 18000),
(442, 51, 84, 1, '2023-11-11', '2023-11-16', 10000),
(443, 51, 85, 1, '2023-11-03', '2023-11-09', 12000),
(444, 51, 86, 1, '2023-11-18', '2023-11-29', 22000),
(445, 51, 87, 1, '2023-11-03', '2023-11-11', 16000),
(446, 51, 88, 1, '2023-11-01', '2023-11-16', 30000),
(447, 51, 89, 1, '2023-11-14', '2023-11-26', 24000),
(448, 51, 90, 1, '2023-11-10', '2023-11-23', 26000),
(449, 51, 91, 1, '2023-11-09', '2023-11-23', 28000),
(450, 51, 92, 1, '2023-11-12', '2023-11-27', 30000),
(451, 51, 93, 1, '2023-11-14', '2023-11-29', 30000),
(452, 51, 94, 1, '2023-11-13', '2023-11-19', 18000),
(453, 51, 95, 1, '2023-11-05', '2023-11-16', 33000),
(454, 51, 96, 2, '2023-11-06', '2023-11-17', 33000),
(455, 51, 97, 2, '2023-11-14', '2023-11-22', 24000),
(456, 51, 98, 2, '2023-11-14', '2023-11-27', 65000),
(457, 51, 99, 2, '2023-11-06', '2023-11-21', 75000),
(458, 51, 100, 2, '2023-11-03', '2023-11-15', 60000),
(459, 51, 101, 2, '2023-11-05', '2023-11-15', 10000),
(460, 51, 102, 2, '2023-11-09', '2023-11-17', 8000),
(461, 51, 103, 2, '2023-11-14', '2023-11-16', 2000),
(462, 51, 104, 2, '2023-11-10', '2023-11-13', 3000),
(463, 51, 105, 2, '2023-11-06', '2023-11-11', 5000),
(464, 51, 106, 2, '2023-11-16', '2023-11-22', 9000),
(465, 51, 107, 2, '2023-11-15', '2023-11-20', 7500),
(466, 51, 108, 2, '2023-11-10', '2023-11-13', 4500),
(467, 51, 109, 2, '2023-11-06', '2023-11-08', 4000),
(468, 51, 110, 2, '2023-11-13', '2023-11-21', 16000),
(469, 51, 111, 2, '2023-11-15', '2023-11-19', 8000),
(470, 51, 112, 2, '2023-11-03', '2023-11-05', 4000),
(471, 51, 113, 2, '2023-11-16', '2023-11-24', 16000),
(472, 51, 114, 2, '2023-11-08', '2023-11-15', 14000),
(473, 51, 115, 2, '2023-11-10', '2023-11-16', 12000),
(474, 51, 116, 2, '2023-11-06', '2023-11-15', 18000),
(475, 51, 117, 2, '2023-11-16', '2023-11-24', 16000),
(476, 51, 118, 2, '2023-11-14', '2023-11-16', 4000),
(477, 51, 119, 2, '2023-11-06', '2023-11-08', 6000),
(478, 51, 120, 2, '2023-11-02', '2023-11-06', 12000),
(479, 51, 121, 2, '2023-11-08', '2023-11-18', 30000),
(480, 51, 122, 2, '2023-11-16', '2023-11-18', 6000),
(481, 51, 123, 2, '2023-11-08', '2023-11-14', 30000),
(482, 51, 124, 2, '2023-11-07', '2023-11-10', 15000),
(483, 51, 125, 2, '2023-11-10', '2023-11-15', 25000),
(484, 51, 126, 2, '2023-11-02', '2023-11-06', 4000),
(485, 51, 127, 2, '2023-11-08', '2023-11-13', 5000),
(486, 51, 128, 2, '2023-11-03', '2023-11-11', 8000),
(487, 51, 129, 2, '2023-11-07', '2023-11-16', 9000),
(488, 51, 130, 2, '2023-11-08', '2023-11-14', 6000),
(489, 51, 131, 2, '2023-11-05', '2023-11-16', 16500),
(490, 51, 132, 2, '2023-11-14', '2023-11-26', 18000),
(491, 51, 133, 2, '2023-11-07', '2023-11-18', 16500),
(492, 51, 134, 2, '2023-11-08', '2023-11-13', 10000),
(493, 51, 135, 2, '2023-11-04', '2023-11-15', 22000),
(494, 51, 136, 2, '2023-11-09', '2023-11-21', 24000),
(495, 51, 137, 2, '2023-11-03', '2023-11-16', 26000),
(496, 51, 138, 2, '2023-11-01', '2023-11-15', 28000),
(497, 51, 139, 2, '2023-11-15', '2023-11-30', 30000),
(498, 51, 140, 2, '2023-11-04', '2023-11-11', 14000),
(499, 51, 141, 2, '2023-11-08', '2023-11-17', 18000),
(500, 51, 142, 2, '2023-11-09', '2023-11-17', 16000),
(501, 51, 143, 2, '2023-11-08', '2023-11-19', 22000),
(502, 51, 144, 2, '2023-11-12', '2023-11-16', 12000),
(503, 51, 145, 2, '2023-11-04', '2023-11-10', 18000),
(504, 51, 146, 3, '2023-11-01', '2023-11-05', 12000),
(505, 51, 147, 3, '2023-11-05', '2023-11-16', 33000),
(506, 51, 148, 3, '2023-11-06', '2023-11-19', 65000),
(507, 51, 149, 3, '2023-11-01', '2023-11-09', 40000),
(508, 51, 150, 3, '2023-11-01', '2023-11-08', 35000),
(509, 51, 151, 3, '2023-11-12', '2023-11-16', 4000),
(510, 51, 152, 3, '2023-11-01', '2023-11-10', 9000),
(511, 51, 153, 3, '2023-11-30', '2023-12-06', 6000),
(512, 51, 154, 3, '2023-11-27', '2023-12-09', 12000),
(513, 51, 155, 3, '2023-11-15', '2023-11-30', 15000),
(514, 51, 156, 3, '2023-11-22', '2023-12-02', 15000),
(515, 51, 157, 3, '2023-11-03', '2023-11-07', 6000),
(516, 51, 158, 3, '2023-11-09', '2023-11-24', 22500),
(517, 51, 159, 3, '2023-11-07', '2023-11-13', 12000),
(518, 51, 160, 3, '2023-11-08', '2023-11-19', 22000),
(519, 51, 161, 3, '2023-11-18', '2023-11-28', 20000),
(520, 51, 162, 3, '2023-11-06', '2023-11-19', 26000),
(521, 51, 163, 3, '2023-11-04', '2023-11-11', 14000),
(522, 51, 164, 3, '2023-11-02', '2023-11-09', 14000),
(523, 51, 165, 3, '2023-11-26', '2023-12-11', 30000),
(524, 51, 166, 3, '2023-11-03', '2023-11-11', 16000),
(525, 51, 167, 3, '2023-11-27', '2023-12-06', 18000),
(526, 51, 168, 3, '2023-11-08', '2023-11-14', 12000),
(527, 51, 169, 3, '2023-11-17', '2023-12-02', 45000),
(528, 51, 170, 3, '2023-11-02', '2023-11-14', 36000),
(529, 51, 171, 3, '2023-11-17', '2023-11-19', 6000),
(530, 51, 172, 3, '2023-11-21', '2023-12-03', 36000),
(531, 51, 173, 3, '2023-11-21', '2023-12-03', 60000),
(532, 51, 174, 3, '2023-11-14', '2023-11-24', 50000),
(533, 51, 175, 3, '2023-11-03', '2023-11-13', 50000),
(534, 51, 176, 3, '2023-11-12', '2023-11-17', 5000),
(535, 51, 177, 3, '2023-11-10', '2023-11-13', 3000),
(536, 51, 178, 3, '2023-11-13', '2023-11-28', 15000),
(537, 51, 179, 3, '2023-11-05', '2023-11-11', 6000),
(538, 51, 180, 3, '2023-11-14', '2023-11-26', 12000),
(539, 51, 181, 3, '2023-11-09', '2023-11-22', 19500),
(540, 51, 182, 3, '2023-11-04', '2023-11-16', 18000),
(541, 51, 183, 3, '2023-11-09', '2023-11-17', 12000),
(542, 51, 184, 3, '2023-11-15', '2023-11-19', 8000),
(543, 51, 185, 3, '2023-11-05', '2023-11-10', 10000),
(544, 51, 186, 3, '2023-11-08', '2023-11-20', 24000),
(545, 51, 187, 3, '2023-11-10', '2023-11-25', 30000),
(546, 51, 188, 3, '2023-11-09', '2023-11-19', 20000),
(547, 51, 189, 3, '2023-11-14', '2023-11-16', 4000),
(548, 51, 190, 3, '2023-11-12', '2023-11-19', 14000),
(549, 51, 191, 3, '2023-11-02', '2023-11-04', 4000),
(550, 51, 192, 3, '2023-11-05', '2023-11-17', 24000),
(551, 51, 193, 3, '2023-11-03', '2023-11-16', 26000),
(552, 51, 194, 3, '2023-11-01', '2023-11-13', 36000),
(553, 51, 195, 3, '2023-11-11', '2023-11-16', 15000);

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
  MODIFY `idHuesped` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- AUTO_INCREMENT de la tabla `reserva`
--
ALTER TABLE `reserva`
  MODIFY `idReserva` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=659;

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
