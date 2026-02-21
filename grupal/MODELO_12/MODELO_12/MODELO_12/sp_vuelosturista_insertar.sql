CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_vuelosturista_insertar`(
    IN clase VARCHAR(20),
    IN numeroVuelo INT,
    IN codigoViaje INT,
    OUT id INT
)
BEGIN
    INSERT INTO VuelosTurista (Clase, Vuelos_NumeroVuelo, ViajesContratados_CodigoViaje)
    VALUES (clase, numeroVuelo, codigoViaje);
    
    SET id = LAST_INSERT_ID();
END