package com.gmail.alexander.vladimirov1902.shortmessagesystem;

/**
 * Created by clouway on 06.07.16.
 *
 * @author alexandervladimirov1902@gmail.com
 *         (Alexander Vladimirov)
 */
interface Sender {
  boolean send(ShortMessage shortMessage) throws GatewayNotReachableException;
}