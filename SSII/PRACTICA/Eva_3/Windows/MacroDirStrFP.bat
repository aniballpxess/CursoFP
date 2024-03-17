
@echo off

md Asignaturas
cd Asignaturas
for %%G in (Prog BBDD SSII LLMM FOL EED) do (
  md "%%G"
  cd "%%G"
  md "TEORIA"
  md "PRACTICA"
  echo.> "info%%G.txt"
  echo.> "recursos%%G.txt"
  cd ..
)
