# solo_alysson
Projeto de Arquitetura de Software: Equilíbrio e Correção de Solo

<h2 align="center">RELATÓRIO</h2>

Cálculo CLOC por classe! Total: 170 linhas de Código (Todas as classes, menos JUnitTest) 
<p align = "center">
  <img src= "/src/main/java/com/mycompany/solo_alysson/to_readme/cloc_solo_alysson.png">
</p>
<h3 align="center">Fazendo uma análise do código e planilha, pude identificar o seguinte:</h3>
<p>Faltou a validação sobre as Fontes de Fósforo e Fontes de Potássio;</p>
<p>Faltou acrescentar o adicional de Nutriente/s que a correção de Fósforo Fornece por Fonte;</p>

<h4>Para a validação sobre as Fontes de Fósforo e Fontes de Potássio, visando evitar o uso de estruturas condicionais, criei as Classes enum's:</h4>

Classe FonteFosforo conforme commit:<a href="https://github.com/alyssoncordeiro/solo_alysson/commit/ed4f7eb"> Criação de classe TeordoPentoxidoDifosforo</a> (Posteriormente renomeada para <a href="https://github.com/alyssoncordeiro/solo_alysson/commit/b706544"> FonteFosforo</a>);
Classe FontePotassio conforme commit:<a href="https://github.com/alyssoncordeiro/solo_alysson/commit/b706544"> Criação de classe FontePotassio</a>.

<h4>Um problema que identifiquei foi que cada Fonte de Fósforo fornece adicionais de nutrientes conforme tabela abaixo:</h4>
<p align = "center">
  <img src= "/src/main/java/com/mycompany/solo_alysson/to_readme/fonte_fosforo_tabela.png">
</p>

<p>Para não usar estruturas condicionais, fixei os valores de adicionais de Nutriente que cada Fonte de Fosforo fornece conforme a Classe: <a   href="https://github.com/alyssoncordeiro/solo_alysson/blob/master/src/main/java/com/mycompany/solo_alysson/FonteFosforo.java"> Fonte de Fosforo</a></p>


<p>O uso do JUnit para validação de cada método/classe: <a href="https://github.com/alyssoncordeiro/solo_alysson/blob/master/src/test/java/com/mycompany/solo_alysson/NewEmptyJUnitTest.java"> Clique Aqui!</a> </p>
