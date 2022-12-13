import React from "react";
import { View, Text, StyleSheet, Image, Button, Alert } from "react-native";

import { clientSendingVotes} from '../../api/api'
import { gameInterface } from "../../interfaces/gameInterface";

const sendingVote = (id:number) => {
    Alert.alert(    
    "Vote sent",
    "thanks for helping decide game of the year",
    [
      { text: "OK", onPress: () => clientSendingVotes(id) }
    ]
  );
}

export function GameCard(props: gameInterface | any){ 
  return (
    <View style={styles.Cardcontainer}>
      <View>
        <Image source={{ uri: props.cover }} style={styles.card} />
      </View>
      <View style={styles.infoContainer}>
        <Text style={styles.label}>{props.name}</Text>
        <Button 
                   onPress={()=>sendingVote(props.id)}
            title='vote'
            color='#9AC33C'
        />
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  Cardcontainer: {
    borderWidth: 2,
    padding: 10,
    borderBottomColor: "#fff",
    width: "100%",
    borderRadius: 8,
    flexDirection: "row",
    backgroundColor: "#404040",
  },
  card: {
    borderRadius: 10,
    width: 200,
    height: 300,
  },
  label: {
    fontSize: 22,
    color: "white",
    paddingBottom: 15,
    textAlign: "center",
  },
  infoContainer: {
    flex: 1,
    justifyContent: "flex-start",
    alignItems: "center",
    textAlign: "center",
    paddingTop: 20,
  },
});
