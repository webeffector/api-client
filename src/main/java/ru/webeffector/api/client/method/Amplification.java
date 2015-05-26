package ru.webeffector.api.client.method;

/**
 * @author Alexandr Kolosov
 * @since 04.09.2014
 */
public interface Amplification {

    LinkAmplification link();

    SocialExternalAmplification social();

    SocialPublicationAmplification publication();

}
