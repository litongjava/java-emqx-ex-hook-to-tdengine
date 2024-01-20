package com.demo.server;

import java.util.Arrays;

import com.google.protobuf.ByteString;

import io.emqx.exhook.ClientAuthenticateRequest;
import io.emqx.exhook.ClientCheckAclRequest;
import io.emqx.exhook.ClientConnackRequest;
import io.emqx.exhook.ClientConnectRequest;
import io.emqx.exhook.ClientConnectedRequest;
import io.emqx.exhook.ClientDisconnectedRequest;
import io.emqx.exhook.ClientSubscribeRequest;
import io.emqx.exhook.ClientUnsubscribeRequest;
import io.emqx.exhook.EmptySuccess;
import io.emqx.exhook.HookSpec;
import io.emqx.exhook.LoadedResponse;
import io.emqx.exhook.Message;
import io.emqx.exhook.MessageAckedRequest;
import io.emqx.exhook.MessageDeliveredRequest;
import io.emqx.exhook.MessageDroppedRequest;
import io.emqx.exhook.MessagePublishRequest;
import io.emqx.exhook.ProviderLoadedRequest;
import io.emqx.exhook.ProviderUnloadedRequest;
import io.emqx.exhook.SessionCreatedRequest;
import io.emqx.exhook.SessionDiscardedRequest;
import io.emqx.exhook.SessionResumedRequest;
import io.emqx.exhook.SessionSubscribedRequest;
import io.emqx.exhook.SessionTakeoveredRequest;
import io.emqx.exhook.SessionTerminatedRequest;
import io.emqx.exhook.SessionUnsubscribedRequest;
import io.emqx.exhook.ValuedResponse;
import io.emqx.exhook.HookProviderGrpc.HookProviderImplBase;
import io.grpc.stub.StreamObserver;

public class HookProviderImpl extends HookProviderImplBase {

  public void DEBUG(String fn, Object req) {
    System.out.printf(fn + ", request: " + req);
  }

  @Override
  public void onProviderLoaded(ProviderLoadedRequest request, StreamObserver<LoadedResponse> responseObserver) {
    DEBUG("onProviderLoaded", request);
    HookSpec[] specs = { HookSpec.newBuilder().setName("client.connect").build(),
        HookSpec.newBuilder().setName("client.connack").build(),
        HookSpec.newBuilder().setName("client.connected").build(),
        HookSpec.newBuilder().setName("client.disconnected").build(),
        HookSpec.newBuilder().setName("client.authenticate").build(),
        HookSpec.newBuilder().setName("client.check_acl").build(),
        HookSpec.newBuilder().setName("client.subscribe").build(),
        HookSpec.newBuilder().setName("client.unsubscribe").build(),

        HookSpec.newBuilder().setName("session.created").build(),
        HookSpec.newBuilder().setName("session.subscribed").build(),
        HookSpec.newBuilder().setName("session.unsubscribed").build(),
        HookSpec.newBuilder().setName("session.resumed").build(),
        HookSpec.newBuilder().setName("session.discarded").build(),
        HookSpec.newBuilder().setName("session.takeovered").build(),
        HookSpec.newBuilder().setName("session.terminated").build(),

        HookSpec.newBuilder().setName("message.publish").build(),
        HookSpec.newBuilder().setName("message.delivered").build(),
        HookSpec.newBuilder().setName("message.acked").build(),
        HookSpec.newBuilder().setName("message.dropped").build() };
    
    LoadedResponse reply = LoadedResponse.newBuilder().addAllHooks(Arrays.asList(specs)).build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onProviderUnloaded(ProviderUnloadedRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onProviderUnloaded", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onClientConnect(ClientConnectRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onClientConnect", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onClientConnack(ClientConnackRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onClientConnack", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onClientConnected(ClientConnectedRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onClientConnected", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onClientDisconnected(ClientDisconnectedRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onClientDisconnected", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onClientAuthenticate(ClientAuthenticateRequest request, StreamObserver<ValuedResponse> responseObserver) {
    DEBUG("onClientAuthenticate", request);
    ValuedResponse reply = ValuedResponse.newBuilder().setBoolResult(true)
        .setType(ValuedResponse.ResponsedType.STOP_AND_RETURN).build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onClientCheckAcl(ClientCheckAclRequest request, StreamObserver<ValuedResponse> responseObserver) {
    DEBUG("onClientCheckAcl", request);
    ValuedResponse reply = ValuedResponse.newBuilder().setBoolResult(true)
        .setType(ValuedResponse.ResponsedType.STOP_AND_RETURN).build();

    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onClientSubscribe(ClientSubscribeRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onClientSubscribe", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onClientUnsubscribe(ClientUnsubscribeRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onClientUnsubscribe", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onSessionCreated(SessionCreatedRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onSessionCreated", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onSessionSubscribed(SessionSubscribedRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onSessionSubscribed", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onSessionUnsubscribed(SessionUnsubscribedRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onSessionUnsubscribed", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onSessionResumed(SessionResumedRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onSessionResumed", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onSessionDiscarded(SessionDiscardedRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onSessionDdiscarded", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onSessionTakeovered(SessionTakeoveredRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onSessionTakeovered", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onSessionTerminated(SessionTerminatedRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onSessionTerminated", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onMessagePublish(MessagePublishRequest request, StreamObserver<ValuedResponse> responseObserver) {
    DEBUG("onMessagePublish", request);

    ByteString bstr = ByteString.copyFromUtf8("hardcode payload by exhook-svr-java :)");

    Message nmsg = Message.newBuilder().setId(request.getMessage().getId()).setNode(request.getMessage().getNode())
        .setFrom(request.getMessage().getFrom()).setTopic(request.getMessage().getTopic()).setPayload(bstr).build();

    ValuedResponse reply = ValuedResponse.newBuilder().setType(ValuedResponse.ResponsedType.STOP_AND_RETURN)
        .setMessage(nmsg).build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onMessageDelivered(MessageDeliveredRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onMessageDelivered", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onMessageAcked(MessageAckedRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onMessageAcked", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }

  @Override
  public void onMessageDropped(MessageDroppedRequest request, StreamObserver<EmptySuccess> responseObserver) {
    DEBUG("onMessageDropped", request);
    EmptySuccess reply = EmptySuccess.newBuilder().build();
    responseObserver.onNext(reply);
    responseObserver.onCompleted();
  }
}
