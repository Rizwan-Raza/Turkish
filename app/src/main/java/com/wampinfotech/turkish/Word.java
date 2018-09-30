package com.wampinfotech.turkish;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Turkish translation for that word.
 */
class Word {

    /**
     * Default translation for the word
     */
    private final String _DefaultTranslation;

    /**
     * Turkish translation for the word
     */
    private final String _TurkishTranslation;

    /**
     * Turkish translation audio for the word
     */
    private final int _TurkishAudio;

    /**
     * Suitable image icon for the word
     */
    private int _ImageIcon = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param turkishTranslation is the word in the Turkish language
     */
    Word(String defaultTranslation, String turkishTranslation, int turkishAudio) {
        _DefaultTranslation = defaultTranslation;
        _TurkishTranslation = turkishTranslation;
        _TurkishAudio = turkishAudio;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param turkishTranslation is the word in the Turkish language
     * @param imageIcon          is the image icon for the word
     */
    Word(String defaultTranslation, String turkishTranslation, int imageIcon, int turkishAudio) {
        _DefaultTranslation = defaultTranslation;
        _TurkishTranslation = turkishTranslation;
        _ImageIcon = imageIcon;
        _TurkishAudio = turkishAudio;
    }

    /**
     * Get the default translation of the word.
     */
    String getDefaultTranslation() {
        return _DefaultTranslation;
    }

    /**
     * Get the Turkish translation of the word.
     */
    String getTurkishTranslation() {
        return _TurkishTranslation;
    }

    /**
     * Get the Turkish translation of the word.
     */
    int getTurkishAudio() {
        return _TurkishAudio;
    }

    /**
     * Get the Image Icon of the word.
     */
    int getImageIcon() {
        return _ImageIcon;
    }

    boolean hasImage() {
        return _ImageIcon != NO_IMAGE_PROVIDED;
    }

}