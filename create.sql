create table client (id integer not null auto_increment, courriel varchar(255), date_de_naissance date, nom varchar(255), prenom varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table compose (mets_id integer not null, tickes_numero integer not null) engine=InnoDB
create table met (dtype varchar(31) not null, id integer not null auto_increment, nom varchar(255), prix float not null, primary key (id)) engine=InnoDB
create table tables (numero integer not null auto_increment, nb_couvert integer not null, supplement float not null, type varchar(255), primary key (numero)) engine=InnoDB
create table ticket (numero integer not null auto_increment, addition float not null, date_time date, nb_couvert integer not null, client_id integer, table_numero integer, primary key (numero)) engine=InnoDB
alter table compose add constraint FKoywte62lkefw8yqvkoo8grvi0 foreign key (tickes_numero) references ticket (numero)
alter table compose add constraint FKj29pcr5umj5989d554urtrqf3 foreign key (mets_id) references met (id)
alter table ticket add constraint FKj2rjr6m31hp7m00tm1hdxckov foreign key (client_id) references client (id)
alter table ticket add constraint FKsr385k2ngitcv6u4j9e0sro4j foreign key (table_numero) references tables (numero)
create table client (id integer not null auto_increment, courriel varchar(255), date_de_naissance date, nom varchar(255), prenom varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table compose (mets_id integer not null, tickes_numero integer not null) engine=InnoDB
create table met (dtype varchar(31) not null, id integer not null auto_increment, nom varchar(255), prix float not null, primary key (id)) engine=InnoDB
create table tables (numero integer not null auto_increment, nb_couvert integer not null, supplement float not null, type varchar(255), primary key (numero)) engine=InnoDB
create table ticket (numero integer not null auto_increment, addition float not null, date_time date, nb_couvert integer not null, client_id integer, table_numero integer, primary key (numero)) engine=InnoDB
alter table compose add constraint FKoywte62lkefw8yqvkoo8grvi0 foreign key (tickes_numero) references ticket (numero)
alter table compose add constraint FKj29pcr5umj5989d554urtrqf3 foreign key (mets_id) references met (id)
alter table ticket add constraint FKj2rjr6m31hp7m00tm1hdxckov foreign key (client_id) references client (id)
alter table ticket add constraint FKsr385k2ngitcv6u4j9e0sro4j foreign key (table_numero) references tables (numero)
create table client (id integer not null auto_increment, courriel varchar(255), date_de_naissance date, nom varchar(255), prenom varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table compose (mets_id integer not null, tickes_numero integer not null) engine=InnoDB
create table met (dtype varchar(31) not null, id integer not null auto_increment, nom varchar(255), prix float not null, primary key (id)) engine=InnoDB
create table tables (numero integer not null auto_increment, nb_couvert integer not null, supplement float not null, type varchar(255), primary key (numero)) engine=InnoDB
create table ticket (numero integer not null auto_increment, addition float not null, date_time date, nb_couvert integer not null, client_id integer, table_numero integer, primary key (numero)) engine=InnoDB
alter table compose add constraint FKoywte62lkefw8yqvkoo8grvi0 foreign key (tickes_numero) references ticket (numero)
alter table compose add constraint FKj29pcr5umj5989d554urtrqf3 foreign key (mets_id) references met (id)
alter table ticket add constraint FKj2rjr6m31hp7m00tm1hdxckov foreign key (client_id) references client (id)
alter table ticket add constraint FKsr385k2ngitcv6u4j9e0sro4j foreign key (table_numero) references tables (numero)
create table client (id integer not null auto_increment, courriel varchar(255), date_de_naissance date, nom varchar(255), prenom varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table compose (mets_id integer not null, tickes_numero integer not null) engine=InnoDB
create table met (dtype varchar(31) not null, id integer not null auto_increment, nom varchar(255), prix float not null, primary key (id)) engine=InnoDB
create table tables (numero integer not null auto_increment, nb_couvert integer not null, supplement float not null, type varchar(255), primary key (numero)) engine=InnoDB
create table ticket (numero integer not null auto_increment, addition float not null, date_time date, nb_couvert integer not null, client_id integer, table_numero integer, primary key (numero)) engine=InnoDB
alter table compose add constraint FKoywte62lkefw8yqvkoo8grvi0 foreign key (tickes_numero) references ticket (numero)
alter table compose add constraint FKj29pcr5umj5989d554urtrqf3 foreign key (mets_id) references met (id)
alter table ticket add constraint FKj2rjr6m31hp7m00tm1hdxckov foreign key (client_id) references client (id)
alter table ticket add constraint FKsr385k2ngitcv6u4j9e0sro4j foreign key (table_numero) references tables (numero)
create table client (id integer not null auto_increment, courriel varchar(255), date_de_naissance date, nom varchar(255), prenom varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table compose (mets_id integer not null, tickes_numero integer not null) engine=InnoDB
create table met (dtype varchar(31) not null, id integer not null auto_increment, nom varchar(255), prix float not null, primary key (id)) engine=InnoDB
create table tables (numero integer not null auto_increment, nb_couvert integer not null, supplement float not null, type varchar(255), primary key (numero)) engine=InnoDB
create table ticket (numero integer not null auto_increment, addition float not null, date_time date, nb_couvert integer not null, client_id integer, table_numero integer, primary key (numero)) engine=InnoDB
alter table compose add constraint FKoywte62lkefw8yqvkoo8grvi0 foreign key (tickes_numero) references ticket (numero)
alter table compose add constraint FKj29pcr5umj5989d554urtrqf3 foreign key (mets_id) references met (id)
alter table ticket add constraint FKj2rjr6m31hp7m00tm1hdxckov foreign key (client_id) references client (id)
alter table ticket add constraint FKsr385k2ngitcv6u4j9e0sro4j foreign key (table_numero) references tables (numero)
create table client (id integer not null auto_increment, courriel varchar(255), date_de_naissance date, nom varchar(255), prenom varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table compose (mets_id integer not null, tickes_numero integer not null) engine=InnoDB
create table met (dtype varchar(31) not null, id integer not null auto_increment, nom varchar(255), prix float not null, primary key (id)) engine=InnoDB
create table tables (numero integer not null auto_increment, nb_couvert integer not null, supplement float not null, type varchar(255), primary key (numero)) engine=InnoDB
create table ticket (numero integer not null auto_increment, addition float not null, date_time date, nb_couvert integer not null, client_id integer, table_numero integer, primary key (numero)) engine=InnoDB
alter table compose add constraint FKoywte62lkefw8yqvkoo8grvi0 foreign key (tickes_numero) references ticket (numero)
alter table compose add constraint FKj29pcr5umj5989d554urtrqf3 foreign key (mets_id) references met (id)
alter table ticket add constraint FKj2rjr6m31hp7m00tm1hdxckov foreign key (client_id) references client (id)
alter table ticket add constraint FKsr385k2ngitcv6u4j9e0sro4j foreign key (table_numero) references tables (numero)
create table client (id integer not null auto_increment, courriel varchar(255), date_de_naissance date, nom varchar(255), prenom varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table compose (mets_id integer not null, tickes_numero integer not null) engine=InnoDB
create table met (dtype varchar(31) not null, id integer not null auto_increment, nom varchar(255), prix float not null, primary key (id)) engine=InnoDB
create table tables (numero integer not null auto_increment, nb_couvert integer not null, supplement float not null, type varchar(255), primary key (numero)) engine=InnoDB
create table ticket (numero integer not null auto_increment, addition float not null, date_time date, nb_couvert integer not null, client_id integer, table_numero integer, primary key (numero)) engine=InnoDB
alter table compose add constraint FKoywte62lkefw8yqvkoo8grvi0 foreign key (tickes_numero) references ticket (numero)
alter table compose add constraint FKj29pcr5umj5989d554urtrqf3 foreign key (mets_id) references met (id)
alter table ticket add constraint FKj2rjr6m31hp7m00tm1hdxckov foreign key (client_id) references client (id)
alter table ticket add constraint FKsr385k2ngitcv6u4j9e0sro4j foreign key (table_numero) references tables (numero)
create table client (id integer not null auto_increment, courriel varchar(255), date_de_naissance date, nom varchar(255), prenom varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table compose (mets_id integer not null, tickes_numero integer not null) engine=InnoDB
create table met (dtype varchar(31) not null, id integer not null auto_increment, nom varchar(255), prix float not null, primary key (id)) engine=InnoDB
create table tables (numero integer not null auto_increment, nb_couvert integer not null, supplement float not null, type varchar(255), primary key (numero)) engine=InnoDB
create table ticket (numero integer not null auto_increment, addition float not null, date_time date, nb_couvert integer not null, client_id integer, table_numero integer, primary key (numero)) engine=InnoDB
alter table compose add constraint FKoywte62lkefw8yqvkoo8grvi0 foreign key (tickes_numero) references ticket (numero)
alter table compose add constraint FKj29pcr5umj5989d554urtrqf3 foreign key (mets_id) references met (id)
alter table ticket add constraint FKj2rjr6m31hp7m00tm1hdxckov foreign key (client_id) references client (id)
alter table ticket add constraint FKsr385k2ngitcv6u4j9e0sro4j foreign key (table_numero) references tables (numero)
create table client (id integer not null auto_increment, courriel varchar(255), date_de_naissance date, nom varchar(255), prenom varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table compose (mets_id integer not null, tickes_numero integer not null) engine=InnoDB
create table met (dtype varchar(31) not null, id integer not null auto_increment, nom varchar(255), prix float not null, primary key (id)) engine=InnoDB
create table tables (numero integer not null auto_increment, nb_couvert integer not null, supplement float not null, type varchar(255), primary key (numero)) engine=InnoDB
create table ticket (numero integer not null auto_increment, addition float not null, date_time date, nb_couvert integer not null, client_id integer, table_numero integer, primary key (numero)) engine=InnoDB
alter table compose add constraint FKoywte62lkefw8yqvkoo8grvi0 foreign key (tickes_numero) references ticket (numero)
alter table compose add constraint FKj29pcr5umj5989d554urtrqf3 foreign key (mets_id) references met (id)
alter table ticket add constraint FKj2rjr6m31hp7m00tm1hdxckov foreign key (client_id) references client (id)
alter table ticket add constraint FKsr385k2ngitcv6u4j9e0sro4j foreign key (table_numero) references tables (numero)
create table client (id integer not null auto_increment, courriel varchar(255), date_de_naissance date, nom varchar(255), prenom varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table compose (mets_id integer not null, tickes_numero integer not null) engine=InnoDB
create table met (dtype varchar(31) not null, id integer not null auto_increment, nom varchar(255), prix float not null, primary key (id)) engine=InnoDB
create table tables (numero integer not null auto_increment, nb_couvert integer not null, supplement float not null, type varchar(255), primary key (numero)) engine=InnoDB
create table ticket (numero integer not null auto_increment, addition float not null, date_time date, nb_couvert integer not null, client_id integer, table_numero integer, primary key (numero)) engine=InnoDB
alter table compose add constraint FKoywte62lkefw8yqvkoo8grvi0 foreign key (tickes_numero) references ticket (numero)
alter table compose add constraint FKj29pcr5umj5989d554urtrqf3 foreign key (mets_id) references met (id)
alter table ticket add constraint FKj2rjr6m31hp7m00tm1hdxckov foreign key (client_id) references client (id)
alter table ticket add constraint FKsr385k2ngitcv6u4j9e0sro4j foreign key (table_numero) references tables (numero)
create table client (id integer not null auto_increment, courriel varchar(255), date_de_naissance date, nom varchar(255), prenom varchar(255), telephone varchar(255), primary key (id)) engine=InnoDB
create table compose (mets_id integer not null, tickes_numero integer not null) engine=InnoDB
create table met (dtype varchar(31) not null, id integer not null auto_increment, nom varchar(255), prix float not null, primary key (id)) engine=InnoDB
create table tables (numero integer not null auto_increment, nb_couvert integer not null, supplement float not null, type varchar(255), primary key (numero)) engine=InnoDB
create table ticket (numero integer not null auto_increment, addition float not null, date_time date, nb_couvert integer not null, client_id integer, table_numero integer, primary key (numero)) engine=InnoDB
alter table compose add constraint FKoywte62lkefw8yqvkoo8grvi0 foreign key (tickes_numero) references ticket (numero)
alter table compose add constraint FKj29pcr5umj5989d554urtrqf3 foreign key (mets_id) references met (id)
alter table ticket add constraint FKj2rjr6m31hp7m00tm1hdxckov foreign key (client_id) references client (id)
alter table ticket add constraint FKsr385k2ngitcv6u4j9e0sro4j foreign key (table_numero) references tables (numero)
create table client (id integer not null auto_increment, courriel varchar(255), date_de_naissance date, nom varchar(255), prenom varchar(255), telephone varchar(255), primary key (id)) engine=MyISAM
create table compose (mets_nom varchar(255) not null, tickets_numero integer not null) engine=MyISAM
create table met (nom varchar(255) not null, prix float not null, type varchar(255), primary key (nom)) engine=MyISAM
create table tables (numero integer not null auto_increment, nb_couvert integer not null, supplement float not null, type varchar(255), primary key (numero)) engine=MyISAM
create table ticket (numero integer not null auto_increment, addition float not null, date_time date, nb_couvert integer not null, client_id integer, table_numero integer, primary key (numero)) engine=MyISAM
alter table compose add constraint FK9nf8o5dgg4ob7jm5jjdc12l24 foreign key (tickets_numero) references ticket (numero)
alter table compose add constraint FK3mpvpyxplpyiiqywfr63sh9qg foreign key (mets_nom) references met (nom)
alter table ticket add constraint FKj2rjr6m31hp7m00tm1hdxckov foreign key (client_id) references client (id)
alter table ticket add constraint FKsr385k2ngitcv6u4j9e0sro4j foreign key (table_numero) references tables (numero)
