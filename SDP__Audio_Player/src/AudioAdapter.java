public class AudioAdapter implements AudioPlayer {
    private AdvancedAudioPlayer advancedAudioPlayer;

    public AudioAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("WAV")) {
            advancedAudioPlayer = new AdvancedAudioPlayer();
        } else if(audioType.equalsIgnoreCase("AAC")) {
            advancedAudioPlayer = new AdvancedAudioPlayer();
        }
    }


    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("WAV")) {
            advancedAudioPlayer.playWAV(fileName);
        } else if(audioType.equalsIgnoreCase("AAC")) {
            advancedAudioPlayer.playAAC(fileName);
        }
    }
}
