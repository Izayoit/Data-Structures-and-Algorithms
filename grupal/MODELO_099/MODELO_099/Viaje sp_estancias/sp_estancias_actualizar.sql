-- Actualizar una estancia
DELIMITER $$
CREATE PROCEDURE sp_estancias_actualizar (
    IN pension VARCHAR(45),
    IN fechaEntrada DATE,
    IN fechaSalida DATE,
    IN idHotel INT,
    IN idEstancia INT
)
BEGIN
    UPDATE Estancias
    SET Pension = pension,
        FechaEntrada = fechaEntrada,
        FechaSalida = fechaSalida,
        Hoteles_CodigoHotel = idHotel
    WHERE CodigoEstancia = idEstancia;
END