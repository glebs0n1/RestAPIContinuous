CREATE TABLE users(
  user_id INT AUTO_INCREMENT PRIMARY KEY,
  user_name VARCHAR(16) NOT NULL,
  user_role INT NOT NULL,
  user_token VARCHAR(255),
  deleted TINYINT NULL DEFAULT 0
);
CREATE TABLE roles(
  role_id INT AUTO_INCREMENT PRIMARY KEY,
  role_name VARCHAR(16) NOT NULL
);
CREATE TABLE messages(
  message_id INT AUTO_INCREMENT PRIMARY KEY,
  message_author INT NOT NULL,
  message_text VARCHAR(255) NOT NULL,
  message_created_at TIMESTAMP NOT NULL DEFAULT LOCALTIMESTAMP()
);

