DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_estancias_actualizar`(
    IN pension VARCHAR(45),
    IN fechaEntrada VARCHAR(45),
    IN fechaSalida VARCHAR(45),
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
END$$
DELIMITER ;