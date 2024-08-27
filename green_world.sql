-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-08-2024 a las 16:35:12
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.0.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `green_world`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administradores`
--

CREATE TABLE `administradores` (
  `Nombre` varchar(50) NOT NULL,
  `Contrasegna` varchar(80) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Edad` int(11) NOT NULL,
  `Rol` varchar(40) NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `donar_arboles`
--

CREATE TABLE `donar_arboles` (
  `Nombre` varchar(70) NOT NULL,
  `Cantidad_Arboles` int(11) NOT NULL,
  `Lugar_Entrega` varchar(50) NOT NULL,
  `Fecha_Entrega` datetime NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `donar_dinero`
--

CREATE TABLE `donar_dinero` (
  `Nombre` varchar(70) NOT NULL,
  `Monto` double NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eventos`
--

CREATE TABLE `eventos` (
  `Titulo` varchar(70) NOT NULL,
  `Hora` datetime NOT NULL,
  `Fecha` datetime NOT NULL,
  `Cantidad_Voluntarios` int(11) NOT NULL,
  `Correo_Administrador` varchar(50) NOT NULL,
  `Lugar` varchar(50) NOT NULL,
  `Cantidad_Arboles` int(11) NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lugares_reforestados`
--

CREATE TABLE `lugares_reforestados` (
  `Nombre` varchar(70) NOT NULL,
  `Lugar` varchar(50) NOT NULL,
  `Anotaciones` text NOT NULL,
  `Fecha` datetime NOT NULL,
  `Extencion` varchar(100) NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mensajes_contacto`
--

CREATE TABLE `mensajes_contacto` (
  `Nombre` varchar(70) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Asunto` text NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `post`
--

CREATE TABLE `post` (
  `Titulo` varchar(100) NOT NULL,
  `Lugar` varchar(60) NOT NULL,
  `Contenido` text NOT NULL,
  `Seccion` varchar(60) NOT NULL,
  `Fecha` datetime NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicitud_reforestacion`
--

CREATE TABLE `solicitud_reforestacion` (
  `Urgencia` varchar(50) NOT NULL,
  `Tipo_Terreno` varchar(50) NOT NULL,
  `Disponibilidad` varchar(50) NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `Nombre` varchar(50) NOT NULL,
  `Contrasegna` varchar(80) NOT NULL,
  `Correo` varchar(50) NOT NULL,
  `Edad` int(11) NOT NULL,
  `ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `administradores`
--
ALTER TABLE `administradores`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `donar_arboles`
--
ALTER TABLE `donar_arboles`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `donar_dinero`
--
ALTER TABLE `donar_dinero`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `eventos`
--
ALTER TABLE `eventos`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `lugares_reforestados`
--
ALTER TABLE `lugares_reforestados`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `mensajes_contacto`
--
ALTER TABLE `mensajes_contacto`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `post`
--
ALTER TABLE `post`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `solicitud_reforestacion`
--
ALTER TABLE `solicitud_reforestacion`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
