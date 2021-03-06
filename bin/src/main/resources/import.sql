INSERT INTO hour_hand (hour_hand_id, detail) VALUES(1, '08:00 - 09:30');
INSERT INTO hour_hand (hour_hand_id, detail) VALUES(2, '09:45 - 11:15');
INSERT INTO hour_hand (hour_hand_id, detail) VALUES(3, '11:30 - 13:00');
INSERT INTO hour_hand (hour_hand_id, detail) VALUES(4, '14:00 - 15:30');
INSERT INTO hour_hand (hour_hand_id, detail) VALUES(5, '15:45 - 17:15');
INSERT INTO hour_hand (hour_hand_id, detail) VALUES(6, '17:30 - 19:00');
INSERT INTO hour_hand (hour_hand_id, detail) VALUES(7, '19:15 - 20:45');
INSERT INTO role (role_id, role) VALUES(1, 'administrator');
INSERT INTO role (role_id, role) VALUES(2, 'student');
INSERT INTO enabled (enabled_id, enabled) VALUES(1, 'enabled');
INSERT INTO enabled (enabled_id, enabled) VALUES(2, 'disabled');
INSERT INTO users (user_id, rut,last_name,name, password ) VALUES(1, '12345678-9', 'zamorano', 'ivan', '1234');
INSERT INTO users (user_id, rut,last_name,name, password ) VALUES(2, '12356987-5', 'vidal', 'arturo', '1234');
INSERT INTO users (user_id, rut,last_name,name, password ) VALUES(3, '19785418-8', 'bielsa', 'marcelo', '1234');
INSERT INTO teacher (teacher_id, dni, last_name, name, enabled_id ) VALUES(1, '23654987-8', 'Torvalds', 'Linus', 1);
INSERT INTO teacher (teacher_id, dni, last_name, name, enabled_id ) VALUES(2, '18964789-3', 'Thompson', 'Ken', 1);
INSERT INTO teacher (teacher_id, dni, last_name, name, enabled_id ) VALUES(3, '13654789-6', 'Hamilton', 'Margaret', 1);
INSERT INTO teacher (teacher_id, dni, last_name, name, enabled_id ) VALUES(4, '17632456-4', 'Dean', 'Jeff', 2);
INSERT INTO users_role(role_id, user_id) VALUES(1, 1);
INSERT INTO users_role(role_id, user_id) VALUES(1, 2);
INSERT INTO users_role(role_id, user_id) VALUES(1, 3);
INSERT INTO users_role(role_id, user_id) VALUES(2, 3);
