-- Consultar un hotel por ID
DELIMITER $$
CREATE PROCEDURE sp_hotel_consultar_uno (
    OUT nombre VARCHAR(45),
    OUT direccion VARCHAR(45),
    OUT ciudad VARCHAR(45),
    OUT telefono VARCHAR(10),
    OUT plazas INT,
    IN idHotel INT
)
BEGIN
    SELECT NombreHotel, DireccionHotel, CiudadHotel, TelefonoHotel, PlazasHotel
    INTO nombre, direccion, ciudad, telefono, plazas
    FROM Hoteles
    WHERE CodigoHotel = idHotel;
END