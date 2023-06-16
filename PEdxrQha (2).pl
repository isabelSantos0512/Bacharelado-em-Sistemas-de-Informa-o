%Relações entre pais e filhos.
progenitor(maria, jose).
progenitor(joao, jose).
progenitor(joao, ana).
progenitor(jose, julia).
progenitor(jose, iris).
progenitor(iris, jorge).
progenitor(julia, pedro).
progenitor(ana,bob).

%Relações entre avós e netos
avo(X, Z) :- progenitor(X, Y), progenitor(Y, Z).

% Regra para encontrar irmãos
irmao_irma(X, Y) :- progenitor(Z, X), progenitor(Z, Y), X \= Y.

% Regra para encontrar tios e tias
tio_tia(X, Y) :- irmao_irma(X, Z), progenitor(Z, Y).

% Regra para encontrar primos e primas
primo_prima(X, Y) :- progenitor(Z, X), tio_tia(Z, W), progenitor(W, Y), X \= Y.
% Regra para encontrar netos
neto(X, Z) :- progenitor(Z, Y), progenitor(Y, X).










