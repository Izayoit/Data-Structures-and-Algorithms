CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_estudiantes_actualizar`(
	IN dato1 VARCHAR(60), IN dato2 VARCHAR(60), IN dato3 VARCHAR(60), IN dato4 VARCHAR(60), IN dato5 INT, IN dato6 INT,IN dato7 INT
)
BEGIN
	DECLARE existe INT DEFAULT 0;

	SELECT COUNT(*) INTO existe FROM estudiantes WHERE id_estudiante = dato7 AND eliminado = 0;

	IF existe = 1 THEN
		UPDATE estudiantes
		SET dni = dato1, nombres = dato2, apellidos = dato3,
			correo = dato4, telefono = dato5, id_carrera = dato6
		WHERE id_estudiante = dato7;
	ELSE
		SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Estudiante no encontrado o eliminado';
	END IF;
END