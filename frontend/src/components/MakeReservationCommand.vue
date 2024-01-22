<template>
    <v-card outlined>
        <v-card-title>
            MakeReservation
        </v-card-title>

        <v-card-text>
            <User offline label="User" v-model="value.user" :editMode="editMode" @change="change"/>
            <Hotel offline label="Hotel" v-model="value.hotel" :editMode="editMode" @change="change"/>
            <String label="RoomType" v-model="value.roomType" :editMode="editMode"/>
            <Payment offline label="PaymentDetails" v-model="value.paymentDetails" :editMode="editMode" @change="change"/>
        </v-card-text>

        <v-card-actions>
            <v-spacer></v-spacer>
            <v-btn
                    color="primary"
                    text
                    @click="makeReservation"
            >
                MakeReservation
            </v-btn>
            
            <v-btn
                    color="primary"
                    text
                    @click="close"
            >
                Close
            </v-btn>
        </v-card-actions>
    </v-card>

</template>

<script>
   
    export default {
        name: 'MakeReservationCommand',
        components:{},
        props: {},
        data: () => ({
            editMode: true,
            value: {},
        }),
        created() {
            this.value.user = {};
            this.value.hotel = {};
            this.value.roomType = '';
            this.value.paymentDetails = {};
        },
        watch: {
        },
        methods: {
            makeReservation() {
                this.$emit('makeReservation', this.value);
            },
            close() {
                this.$emit('closeDialog');
            },
            change() {
                this.$emit('input', this.value);
            },
        }
    }
</script>

