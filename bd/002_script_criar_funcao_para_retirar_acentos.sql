CREATE OR REPLACE FUNCTION SEM_ACENTO(text)
RETURNS text AS
$BODY$
select
translate($1,'áàâãäéèêëíìïóòôõöúùûüÁÀÂÃÄÉÈÊËÍÌÏÓÒÔÕÖÚÙÛÜçÇ',
        'aaaaaeeeeiiiooooouuuuAAAAAEEEEIIIOOOOOUUUUcC');
$BODY$
LANGUAGE 'sql' IMMUTABLE STRICT;