CREATE DATABASE agencia_viajes;
USE agencia_viajes;

-- 1. Sucursales
CREATE TABLE Sucursales (
    CodigoSucursal INT AUTO_INCREMENT PRIMARY KEY,
    DireccionSucursal VARCHAR(45),
    TelefonoSucursal VARCHAR(10)
);

-- 2. Hoteles
CREATE TABLE Hoteles (
    CodigoHotel INT AUTO_INCREMENT PRIMARY KEY,
    NombreHotel VARCHAR(45),
    DireccionHotel VARCHAR(45),
    CiudadHotel VARCHAR(45),
    TelefonoHotel VARCHAR(10),
    PlazasHotel INT,
    Eliminado TINYINT DEFAULT 0  -- 0: activo, 1: eliminado
);

-- 3. Estancias
CREATE TABLE Estancias (
    CodigoEstancia INT AUTO_INCREMENT PRIMARY KEY,
    Pension VARCHAR(45),
    FechaEntrada DATE,
    FechaSalida DATE,
    Hoteles_CodigoHotel INT,
    FOREIGN KEY (Hoteles_CodigoHotel) REFERENCES Hoteles(CodigoHotel)
);

-- 4. Turistas
CREATE TABLE Turistas (
    CodigoTuristas INT AUTO_INCREMENT PRIMARY KEY,
    NombreTurista VARCHAR(45),
    ApellidosTurista VARCHAR(45),
    DireccionTurista VARCHAR(80),
    TelefonoTurista VARCHAR(10)
);

-- 5. ViajesContratados
CREATE TABLE ViajesContratados (
    CodigoViaje INT AUTO_INCREMENT PRIMARY KEY,
    Turistas_CodigoTuristas INT,
    Sucursales_CodigoSucursal INT,
    Estancias_CodigoEstancia INT,
    FOREIGN KEY (Turistas_CodigoTuristas) REFERENCES Turistas(CodigoTuristas),
    FOREIGN KEY (Sucursales_CodigoSucursal) REFERENCES Sucursales(CodigoSucursal),
    FOREIGN KEY (Estancias_CodigoEstancia) REFERENCES Estancias(CodigoEstancia)
);

-- 6. Vuelos
CREATE TABLE Vuelos (
    NumeroVuelo INT AUTO_INCREMENT PRIMARY KEY,
    FechaVuelo DATE,
    HoraVuelo TIME,
    OrigenVuelo VARCHAR(45),
    DestinoVuelo VARCHAR(45),
    PlazasTotales INT,
    PlazasTurista INT
);

-- 7. VuelosTurista
CREATE TABLE VuelosTurista (
    CodigoVueloTurista INT AUTO_INCREMENT PRIMARY KEY,
    Clase VARCHAR(20),
    Vuelos_NumeroVuelo INT,
    ViajesContratados_CodigoViaje INT,
    FOREIGN KEY (Vuelos_NumeroVuelo) REFERENCES Vuelos(NumeroVuelo),
    FOREIGN KEY (ViajesContratados_CodigoViaje) REFERENCES ViajesContratados(CodigoViaje)
);

