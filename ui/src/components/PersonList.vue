<template>

    <table class="table table-hover table-striped" v-if="people.length > 0">
        <thead>
        <tr>
            <td></td>
            <td>First Name</td>
            <td>Last Name</td>
        </tr>
        </thead>
        <tbody>
        <tr v-for="person in people">
            <td>
                <form @submit.prevent="deletePerson(person.id)">
                    <input class="btn btn-danger" type="submit" value="Delete"/>
                </form>
            </td>
            <td>{{ person.firstName }}</td>
            <td>{{ person.lastName }}</td>
        </tr>
        </tbody>
    </table>
    <p v-else>
    </p>
</template>

<script>
    export default {
        props: {
            people: {
                type: Array,
                required: true
            }
        },
        methods: {
            deletePerson(id) {
                this.$emit('deletePerson', {
                    id
                })
            }
        }
    }
</script>
