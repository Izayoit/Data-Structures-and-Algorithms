delimiter $$
CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_vuelosturistas_actualizar`(
    IN codigoVueloTurista INT,
    IN clase VARCHAR(20),
    IN numeroVuelo INT,
    IN codigoViaje INT
)
BEGIN
    UPDATE VuelosTurista
    SET
        Clase = clase,
        Vuelos_NumeroVuelo = numeroVuelo,
        ViajesContratados_CodigoViaje = codigoViaje
    WHERE
        CodigoVueloTurista = codigoVueloTurista
        AND eliminado = 0;
END$$
delimiter ;