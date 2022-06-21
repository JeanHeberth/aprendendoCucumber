package br.com.test.steps;

import br.com.test.converters.DateConverter;
import cucumber.api.Transform;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.junit.Assert;

import java.util.Calendar;
import java.util.Date;

public class AprenderCucumberSteps {

    @Dado("^Que eu criei o arquivo corretamente$")
    public void queEuCrieiOArquivoCorretamente() throws Throwable {
    }

    @Quando("^Executá-lo$")
    public void executáLo() throws Throwable {
    }

    @Então("^A especificação deve finalizar com sucesso$")
    public void aEspecificaçãoDeveFinalizarComSucesso() throws Throwable {
    }

    private int contador = 0;

    @Dado("^que o valor do contador é (\\d+)$")
    public void queOValorDoContadorÉ(int arg1) throws Throwable {
        contador = arg1;
    }

    @Quando("^eu incrementar em (\\d+)$")
    public void euIncrementarEm(int arg1) throws Throwable {
        contador = contador + arg1;
    }

    @Então("^o valor do contador será (\\d+)$")
    public void oValorDoContadorSerá(int arg1) throws Throwable {
        Assert.assertEquals(arg1, contador);
    }

    Date entrega = new Date();

    @Dado("^que a entrega é dia (.*)$")
    public void queAEntregaÉDia(@Transform(DateConverter.class) Date data) throws Throwable {
        entrega = data;
        System.out.println(entrega);
    }

    @Quando("^a entrega atrasar e (\\d+) (dia|dias|mes|meses)$")
    public void aEntregaAtrasarEDias(int arg1, String tempo) throws Throwable {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(entrega);
        if (tempo.equals("dias")) {
            calendar.add(Calendar.DAY_OF_MONTH, arg1);
            entrega = calendar.getTime();
        }
        if (tempo.equals("meses")) {
            calendar.add(Calendar.MONTH, arg1);
            entrega = calendar.getTime();
        }
    }

    @Então("^a entrega será efetuada em (.*)$")
    public void aEntregaSeráEfetuadaEm(@Transform(DateConverter.class) Date dataFormatada) throws Throwable {
        entrega = dataFormatada;
        Assert.assertEquals(dataFormatada, dataFormatada);

    }

    @Dado("^que o ticket( especial)? é (A.\\d{3})$")
    public void queOTicketÉAF(String tipo, String arg1) throws Throwable {


    }

    @E("^que o valor da passagem é R\\$ (.*)$")
    public void queOValorDaPassagemÉR$(Double numero) throws Throwable {
        System.out.println(numero);

    }


    @E("^que o nome do passageiro é \"(.{5,20})\"$")
    public void queONomeDoPassageiroÉ(String arg1) throws Throwable {


    }

    @E("^que o telefone do passageiro é (9\\d{3}-\\d{4})$")
    public void queOTelefoneDoPassageiroÉ(String telefone) throws Throwable {


    }

    @Quando("^criar os steps$")
    public void criarOsSteps() throws Throwable {


    }

    @Então("^o teste vai funcionar$")
    public void oTesteVaiFuncionar() throws Throwable {


    }


}
