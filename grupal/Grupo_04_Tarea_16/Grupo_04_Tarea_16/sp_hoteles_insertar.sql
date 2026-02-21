DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_hotel_insertar`(
    IN nombre VARCHAR(45),
    IN direccion VARCHAR(45),
    IN ciudad VARCHAR(45),
    IN telefono VARCHAR(10),
    IN plazas INT,
    OUT codigoHotel INT
)
BEGIN
    INSERT INTO Hoteles (NombreHotel, DireccionHotel, CiudadHotel, TelefonoHotel, PlazasHotel)
    VALUES (nombre, direccion, ciudad, telefono, plazas);
    SET codigoHotel = LAST_INSERT_ID();
END$$
DELIMITER ;