---=-=-=-=-=-=-=--=-=SELECTS-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=



---=-=-=-=-=-=-=-=-=-=INSERTS-=-=-=-=-=-=-=-=-=-=-=-=-=-=-

-- cpf, celular, cep, dta_nascimento,email,nome,rg,tel_residencia
INSERT INTO passageiro VALUES ('11867136902', '85468729','86088040','2000-07-19','Gabriel@gmail.com','Gabriel dos Santos','142003002', '33294599');
INSERT INTO passageiro VALUES ('11867136903', '85115484','86088040','2000-06-12','victor@outlook.com','Victor Felipe','142003003', '549456181');

--COD_VIAGEM / EMPRESA_TRANS / NOME_VIAGEM / PRECO_VIAGEM
--INSERT INTO viagem VALUES (DEFAULT, 'Brasil-Sul', 'Praia', 1200.00);
--INSERT INTO viagem VALUES (DEFAULT, 'Transline', 'Salto Banderantes', 200.60);

--COD_CONTRATO / FORM_PAGAMENTO / NUM_PARCELAS / PARC_RESTANTES / VAL_PARCELAS
-- VALOR_DESCONTO / VALOR_JUROS / VALOR_TOT_PAGO / PASSAGEIRO_CPF / VIAGEM_COD_VIAGEM

--INSERT INTO contrato VALUES (DEFAULT, 'avista', 0, 0, 0, 200, 0, 1000, '11867136902', 1 );
--INSERT INTO contrato VALUES (DEFAULT, 'parcelado', 2, 2, 100, 0, 0, 0, '11867136903', 2);
--INSERT INTO contrato VALUES (DEFAULT, 'parcelado', 2, 2, 100, 0, 0, 0, '11867136902', 2);
