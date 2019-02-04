insert into user(id_user, name, email) values(0, 'John Galt', 'john@galt.com');
insert into user(id_user, name, email) values(1, 'Heinrich Harrer', 'heinrich@harrer.com');
insert into user(id_user, name, email) values(2, 'Eric Berne', 'eric@berne.com');

insert into project(id_project, name) values(0, '7 Years in Tibet');
insert into project(id_project, name) values(1, 'Transactional Analysis');

insert into work(id_work, task, id_user, id_project) values(0, 'British captivity', 1, 0);
insert into work(id_work, task, id_user, id_project) values(1, 'Wandering', 1, 0);
insert into work(id_work, task, id_user, id_project) values(2, 'Lhasa', 1, 0);

insert into work(id_work, task, id_user, id_project) values(3, 'Games People Play', 2, 1);
insert into work(id_work, task, id_user, id_project) values(3, 'What Do You Say After You Say Hello?', 2, 1);