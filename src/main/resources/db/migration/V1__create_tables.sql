CREATE TABLE authors (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    birth_date DATE
);

CREATE TABLE books (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    isbn VARCHAR(255),
    language VARCHAR(50),
    release_year INT,
    number_of_pages INT,
    author_id BIGINT,
    CONSTRAINT fk_author FOREIGN KEY (author_id) REFERENCES authors(id)
);
