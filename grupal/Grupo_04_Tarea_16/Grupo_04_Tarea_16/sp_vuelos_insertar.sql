DELIMITER $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_vuelos_insertar`(
	IN fecha VARCHAR(45), IN hora VARCHAR(45),
	IN origen VARCHAR(45), IN destino VARCHAR(45),
	IN plazasTotales INT, IN plazasOcupadas INT,
	OUT id INT
)
BEGIN
	INSERT INTO Vuelos(FechaVuelo, HoraVuelo, OrigenVuelo, DestinoVuelo, PlazasTotales, PlazasTurista)
	VALUES(fecha, hora, origen, destino, plazasTotales, plazasOcupadas);
    
	SET id = LAST_INSERT_ID();
END$$
DELIMITER ;