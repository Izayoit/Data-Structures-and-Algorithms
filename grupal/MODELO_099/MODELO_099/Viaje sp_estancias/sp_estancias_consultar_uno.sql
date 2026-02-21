-- Consultar una estancia por ID
DELIMITER $$
CREATE PROCEDURE sp_estancias_consultar_uno (
    OUT pension VARCHAR(45),
    OUT fechaEntrada DATE,
    OUT fechaSalida DATE,
    OUT idHotel INT,
    IN idEstancia INT
)
BEGIN
    SELECT Pension, FechaEntrada, FechaSalida, Hoteles_CodigoHotel
    INTO pension, fechaEntrada, fechaSalida, idHotel
    FROM Estancias
    WHERE CodigoEstancia = idEstancia;
END
