DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_estancias_insertar`(
    IN pension VARCHAR(45),
    IN fechaEntrada VARCHAR(45),
    IN fechaSalida VARCHAR(45),
    IN idHotel INT,
    OUT id INT
)
BEGIN
    INSERT INTO Estancias (Pension, FechaEntrada, FechaSalida, Hoteles_CodigoHotel)
    VALUES (pension, fechaEntrada, fechaSalida, idHotel);
    SET id = LAST_INSERT_ID();
END$$
DELIMITER ;