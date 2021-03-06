INSERT INTO hour_hand (hour_hand_id, detail) VALUES(1, '08:00 - 09:30');
INSERT INTO hour_hand (hour_hand_id, detail) VALUES(2, '09:45 - 11:15');
INSERT INTO hour_hand (hour_hand_id, detail) VALUES(3, '11:30 - 13:00');
INSERT INTO day (day_id, day) VALUES(1, 'lunes');
INSERT INTO day (day_id, day) VALUES(2, 'martes');
INSERT INTO day (day_id, day) VALUES(3, 'miercoles');
INSERT INTO day (day_id, day) VALUES(4, 'jueves');
INSERT INTO day (day_id, day) VALUES(5, 'viernes');
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(1, 1, 1);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(2, 2, 1);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(3, 3, 1);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(4, 4, 1);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(5, 5, 1);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(6, 1, 2);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(7, 2, 2);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(8, 3, 2);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(9, 4, 2);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(10, 5, 2);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(11, 1, 3);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(12, 2, 3);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(13, 3, 3);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(14, 4, 3);
INSERT INTO day_hour_hand (day_hour_hand_id, day_id, hour_hand_id) VALUES(15, 5, 3);
INSERT INTO role (role_id, role) VALUES(1, 'administrator');
INSERT INTO role (role_id, role) VALUES(2, 'student');
INSERT INTO enabled (enabled_id, enabled) VALUES(1, 'activo');
INSERT INTO enabled (enabled_id, enabled) VALUES(2, 'inactivo');
INSERT INTO users (user_id, rut,last_name,name, password ) VALUES(1, '12345678-9', 'zamorano', 'ivan', '$2a$04$JxvWHwaV9Wiimg21GE6FkudtIzUK4cp6/AcwKnOtGVFKvmEVhKbnG');
INSERT INTO users (user_id, rut,last_name,name, password ) VALUES(2, '12356987-5', 'vidal', 'arturo', '$2a$04$JxvWHwaV9Wiimg21GE6FkudtIzUK4cp6/AcwKnOtGVFKvmEVhKbnG');
INSERT INTO users (user_id, rut,last_name,name, password ) VALUES(3, '19785418-8', 'bielsa', 'marcelo', '$2a$04$JxvWHwaV9Wiimg21GE6FkudtIzUK4cp6/AcwKnOtGVFKvmEVhKbnG');
INSERT INTO teacher (teacher_id, dni, last_name, name, enabled_id ) VALUES(1, '23654987-8', 'Torvalds', 'Linus', 1);
INSERT INTO teacher (teacher_id, dni, last_name, name, enabled_id ) VALUES(2, '18964789-3', 'Thompson', 'Ken', 1);
INSERT INTO teacher (teacher_id, dni, last_name, name, enabled_id ) VALUES(3, '13654789-6', 'Hamilton', 'Margaret', 1);
INSERT INTO teacher (teacher_id, dni, last_name, name, enabled_id ) VALUES(4, '17632456-4', 'Dean', 'Jeff', 2);
INSERT INTO users_role(role_id, user_id) VALUES(2, 1);
INSERT INTO users_role(role_id, user_id) VALUES(2, 2);
INSERT INTO users_role(role_id, user_id) VALUES(1, 3);
INSERT INTO subject(subject_id, description, name, quantity, day_hour_hand_id, teacher_id ) VALUES(1, 'introduccion a la programacion', 'introduccion a la programacion', 5, 1, 1);
INSERT INTO subject(subject_id, description, name, quantity, day_hour_hand_id, teacher_id ) VALUES(2, 'algebra basica', 'algebra', 5, 1, 1);
INSERT INTO subject_user (subject_id, user_id) VALUES(1, 1);
INSERT INTO subject_user (subject_id, user_id) VALUES(1, 2);