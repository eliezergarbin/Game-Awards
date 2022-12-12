import React from "react";
import { View, Text, StyleSheet } from "react-native";

export function WinnerScreen() {
  return (
    <View>
      <Text style={styles.container}></Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    color: "#fff",
    backgroundColor: "#191919",
    alignItems: "center",
    justifyContent: "center",
  },
});
