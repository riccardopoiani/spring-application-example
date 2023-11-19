INSERT INTO user(ssn, birth_city, birth_date, birth_nation, first_name, last_name) VALUES
  ('user1', 'milan', '1990-01-01', 'italy', 'mattia', 'zhao');
INSERT INTO user(ssn, birth_city, birth_date, birth_nation, first_name, last_name) VALUES
  ('user2', 'brescia', '1990-03-11', 'italy', 'riccardo', 'zhao');

INSERT INTO health_data(id, timestamp, user_ssn, heart_beat, pressure_min, pressure_max, blood_oxygen_level) VALUES
  (1, '2010-01-01 06:00:00','user1', 50, 60, 100, 75);
INSERT INTO health_data(id, timestamp, user_ssn, heart_beat, pressure_min, pressure_max, blood_oxygen_level) VALUES
  (2, '2010-01-01 08:00:00','user1', 70, 68, 101, 90);
INSERT INTO health_data(id, timestamp, user_ssn, heart_beat, pressure_min, pressure_max, blood_oxygen_level) VALUES
  (3, '2010-01-01 10:00:00','user1', 120, 65, 110, 79);
INSERT INTO health_data(id, timestamp, user_ssn, heart_beat, pressure_min, pressure_max, blood_oxygen_level) VALUES
  (4, '2010-01-01 11:00:00','user2', 100, 70, 120, 78);