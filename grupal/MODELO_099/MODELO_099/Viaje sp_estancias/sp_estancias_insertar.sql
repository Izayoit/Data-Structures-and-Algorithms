-- Insertar una estancia
DELIMITER $$
CREATE PROCEDURE sp_estancias_insertar (
    IN pension VARCHAR(45),
    IN fechaEntrada DATE,
    IN fechaSalida DATE,
    IN idHotel INT
)
BEGIN
    INSERT INTO Estancias (Pension, FechaEntrada, FechaSalida, Hoteles_CodigoHotel)
    VALUES (pension, fechaEntrada, fechaSalida, idHotel);
END 