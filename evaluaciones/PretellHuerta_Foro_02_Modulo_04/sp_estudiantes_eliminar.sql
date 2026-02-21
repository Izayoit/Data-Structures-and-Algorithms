CREATE DEFINER=`root`@`localhost` PROCEDURE `sp_estudiantes_eliminar`(
	IN dato1 INT
)
BEGIN
	DECLARE existe INT DEFAULT 0;

	SELECT COUNT(*) INTO existe FROM estudiantes WHERE id_estudiante = dato1 AND eliminado = 0;

	IF existe = 1 THEN
		UPDATE estudiantes SET eliminado = 1 WHERE id_estudiante = dato1;
	ELSE
		SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Estudiante no encontrado o ya eliminado';
	END IF;
END