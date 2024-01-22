select * from public.clienti;
select * from public.fatture;
select * from public.fornitori;
select * from public.prodotti;

select nome from public.clienti;

select * from public.clienti where nome like 'Mario';

select nome,cognome from public.clienti where anno_di_nascita=1982;

select * from public.fatture where iva=20;

select * from public.prodotti where extract(year from data_attivazione)=2017 and in_produzione=true or in_commercio=true;

select * from public.fatture inner join public.clienti on id_cliente=numero_cliente where importo<1000;

select numero_fattura,tipologia,importo,iva,data_fattura,id_cliente,denominazione from public.fatture f inner join public.fornitori ff on f.numero_fornitore=ff.numero_fornitore;

select extract(year from data_fattura) as anno, count(iva) from public.fatture where iva=20 group by anno;

select extract(year from data_fattura) as anno, sum(importo) as totale, count(*) from public.fatture group by anno;

select extract(year from data_fattura) as anno from public.fatture where tipologia='A' group by anno having count(*)>=2;

select regione_di_residenza, sum(importo) from public.fatture inner join public.clienti on id_cliente=numero_cliente group by regione_di_residenza;

select count(*) as numero from public.fatture inner join public.clienti on id_cliente=numero_cliente where importo>50 and anno_di_nascita=1980

select json_agg(row_to_json(clienti)) from public.clienti;
