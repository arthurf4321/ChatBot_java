import bot.Chatbot;
import api.Cs2apiCliente;
import ui.chatWindow;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        boolean statsPlayerKeyWords = false;

        // Recebendo e tratando interacao usuario e bot
        chatWindow usuario1 = new chatWindow();
        usuario1.Question();
        String response = usuario1.returnRead();
        String standardizedResponse = response.toLowerCase().trim();

        String[] keyWordsPlayers = new String[5];
            keyWordsPlayers[0] = "jogador";
            keyWordsPlayers[1] = "player";
            keyWordsPlayers[2] = "pro";
            keyWordsPlayers[3] = "atleta";
            keyWordsPlayers[4] = "competidor";

        for (String keyWordsPlayer : keyWordsPlayers) {
            if(standardizedResponse.contains(keyWordsPlayer)) {
                statsPlayerKeyWords = true;
                break;
            }
        }

        if(statsPlayerKeyWords) {
            System.out.println("OK, me diga agora o nome do jogador que gostaria de saber sobre!!");
            String playerName = usuario1.returnRead();
            playerName = playerName.toLowerCase().trim();
            System.out.println("Você quer saber sobre o jogador: " + playerName);
        }else{
            System.out.println("Infelizmente nao entendi");
        }
    }
}
