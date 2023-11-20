package dev.vivek.practiceparkinglot.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EntryGate extends Gate{
    private DisplayBoard displayBoard;
}
