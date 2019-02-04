create table if not exists user (
    id_user INT IDENTITY NOT NULL,
    email VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,

    CONSTRAINT PK_id_user PRIMARY KEY (id_user)
);

ALTER TABLE USER ADD CONSTRAINT EMAIL_UNIQUE UNIQUE(EMAIL);

create table if not exists project (
    id_project INT IDENTITY NOT NULL,
    name VARCHAR(255) NOT NULL,

    CONSTRAINT PK_id_project PRIMARY KEY (id_project)
);

create table if not exists work (
    id_work INT NOT NULL,
    task VARCHAR(255) NOT NULL,
    comment VARCHAR(255),
    id_user INT NOT NULL,
    id_project INt NOT NULL,

    CONSTRAINT FK_user
        FOREIGN KEY (id_user)
        REFERENCES user (id_user),

    CONSTRAINT FK_project
        FOREIGN KEY (id_project)
        REFERENCES project (id_project)
);