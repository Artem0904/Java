export interface ICounterState {
    count: number
};

const initState: ICounterState = {
    count: 0,
}

const CounterReducer = (state = initState): any => {
    // switch (action.type) {
    //     return state;
    // }
    return state;
}

export default CounterReducer;