SELECT cpf,rg,nome,dta_nascimento,cep,celular,tel_residencia,email FROM PASSAGEIRO;

INSERT INTO passageiro (cpf, celular, cep, dta_nascimento,email,nome,rg,tel_residencia) VALUES ('1234556', '85115484','86088040','2000-06-12','VICTOR@VICTOR.COM','VICTOR','12546877', '549456181');

INSERT INTO viagem VALUES (DEFAULT, 'TESTEEMPRE', 'TESTENOME', 5000);
INSERT INTO viagem VALUES (DEFAULT, 'TESTE2EMPRE', 'TESTE2NOME', 8000);